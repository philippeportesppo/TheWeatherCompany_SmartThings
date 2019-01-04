/**
 *  The Weather Company Web Smartapp
 *
 *  Copyright 2019 Philippe Portes
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
definition(
    name: "The Weather Company Web Smartapp",
    namespace: "philippeportesppo",
    author: "Philippe Portes",
    description: "SmartApp enabling weather alerts and weather triggered actions based on The Weather Company web API (no hardware is required)",
    category: "My Apps",
    iconUrl: "https://business.weather.com/img/the-weather-company-logo.png",
    iconX2Url: "https://business.weather.com/img/the-weather-company-logo.png",
    iconX3Url: "https://business.weather.com/img/the-weather-company-logo.png")


preferences {


        section("Alert Settings") {
            input "twcsnowalert", "bool", title: "Snow Alert"
            input "twcstormalert", "bool", title: "Storm Alert" 
        	input "twctwcinalert", "bool", title: "Rain Alert"
			input "twctwcwtempalert", "number", title: "Low temperature Alert (C or F)", required: false
 			input "twctwcghtempalert", "number", title: "High temperature Alert (C or F)", required: false
			input "twclowhumidityalert", "decimal", title: "Low humidity Alert (0-100)", required: false
            input "twchighhumidityalert", "decimal", title: "High humidity Alert (0-100)", required: false            
        }
        
        section("Switch On these on Snow Alert:")
        {
        	input "twcsnowon", "capability.switch", required: false, multiple: true
        }
  twc    
        section("Switch Off these on Snow Alert:")
        {
        	input "twcsnowoff", "capability.switch", required: false, multiple: true
        }
  twc    
        section("Switch On these on Rain Alert:")
        {
        	input "twcrainon", "capability.switch", required: false, multiple: true
        }
  twc    
        section("Switch Off these on Rain Alert:")
        {
        	input "twcrainoff", "capability.switch", required: false, multiple: true
        }
  twc    
        section("Switch On these on Storm Alert:")
        {
        	input "twcstormon", "capability.switch", required: false, multiple: true
        }
  twc    
        section("Switch Off these on Storm Alert:")
        {
        	input "twcstormoff", "capability.switch", required: false, multiple: true
        }
  twc    
		section("Switch On these on Low Temperature Alert:")
        {
        	input "twclowton", "capability.switch", required: false, multiple: true
        }
  twc    
        section("Switch Off these on Low Temperature Alert:")
        {
        	input "twclowtoff", "capability.switch", required: false, multiple: true
        }
  twc   	
        section("Switch On these on High Temperature Alert:")
        {
        	input "twchighton", "capability.switch", required: false, multiple: true
        }
  twc    
        section("Switch Off these on High Temperature Alert:")
        {
        	input "twchightoff", "capability.switch", required: false, multiple: true
        }
  twc    
        section("Switch On these on Low Humidity Alert:")
        {
        	input "twclowhon", "capability.switch", required: false, multiple: true
        }
  twc    
        section("Switch Off these on Low Humidity Alert:")
        {
        	input "twclowhoff", "capability.switch", required: false, multiple: true
        }
  twc    
        section("Switch On these on High Humidity Alert:")
        {
        	input "twchighhon", "capability.switch", required: false, multiple: true
        }
        
        section("Switch Off these on High Humidity Alert:")
        {
        	input "twchighhoff", "capability.switch", required: false, multiple: true
        }
        
}

def installed() {
	log.debug "Installed with settings: ${settings}"
	state.deviceId="12345678AF"
    state.deviceName=""
    state.deviceRef= getAllChildDevices()?.find {
    it.device.deviceNetworkId == state.deviceId}
	log.debug "state.deviceRef installed with ${state.deviceRef}"
}

def updated() {
	log.debug "Updated with settings: ${settings}"

	unsubscribe() 
    addDevices()
    //initialize()

}

def initialize() {
	log.debug "initialize"
    
}

private removeChildDevices(delete) {
    delete.each {
        deleteChildDevice(it.deviceNetworkId)
    }
}

def uninstalled() {
    removeChildDevices(getChildDevices())
}

def addDevices() {
	    
    if (childDevices)
    {
        def Ref= getAllChildDevices()?.find {
            it.device.deviceNetworkId == state.deviceId}
        log.debug "Devices installed before removal ${Ref}"
        // Make sure the settings are applied by removing the previous occurence
        removeChildDevices(getChildDevices())

        Ref= getAllChildDevices()?.find {
            it.device.deviceNetworkId == state.deviceId}
        log.debug "Devices installed after removal ${Ref}"
    }
    // and create it again with the new settings
    def mymap = getTwcLocation()
    
    log.debug mymap

    def twccity = mymap['location']['city']
    def twcstate = mymap['location']['adminDistrictCode']
    log.debug twccity
    subscribe(addChildDevice("philippeportesppo", "The Weather Company Web", state.deviceId, null, [
        "label": "Weather in ${twccity}, ${twcstate}",
        "data": [
            "TWCsnowalert": twcsnowalert,
            "TWCstormalert": twcstormalert,
            "TWCrainalert": twcrainalert,
            "TWClowtempalert": twclowtempalert,
            "TWChightempalert": twchightempalert,
            "TWClowhumidityalert": twclowhumidityalert,
            "TWChighhumidityalert": twchighhumidityalert,
            /*completedSetup: true*/]
    ]), "Alert", eventHandler)                           
}

def eventHandler(evt)
{
	Map options = [:]
	log.debug "TWC evt: ${evt}"
	if (evt.name == "Alert")
    {
    	if (evt.value.contains("Snow")) {
            if (twcsnowon!=null)
        		twcsnowon.on()
            if (twcsnowoff!=null)
            	twcsnowoff.off()
            }
            
    	if (evt.value.contains("Rain")) {
            if (twcrainon!=null)
		       	twcrainon.on()
            if (twcrainoff!=null)
            	twcrainoff.off()
            }    
            
		if (evt.value.contains("Storm")) {
            if (twcrainon!=null)
        		twcrainon.on()
            if (twcrainoff!=null)
            	twcrainoff.off()
            }     	

		if (evt.value.contains("Temperature")) {
        	if (evt.value.contains("High"))
            {
               	if (twchighton!=null)
        			twchighton.on()
                    
                if (twchighton!=null)
            		twchightoff.off()
            }
            else
            {
                if (twclowton!=null)
        			twclowton.on()

                if (twclowtoff!=null)
            		twclowtoff.off()            
            }
		}
        
        if (evt.value.contains("Humidity")) {
        	if (evt.value.contains("High"))
            {
            	if (twchighhon!=null)
        			twchighhon.on()
                    
                if (twchighhoff!=null)
            		twchighhoff.off()
            }
            else
            {
                if (twclowhon!=null)
        			twclowhon.on()
                    
                if (twclowhoff!=null)
	            	twclowhoff.off()            
            }
		}
        
    	options.method = 'push'
        sendNotification(evt.value, options) 

    }
 
                    
}