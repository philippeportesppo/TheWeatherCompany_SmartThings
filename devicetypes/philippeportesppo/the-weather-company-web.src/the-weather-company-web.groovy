/**
 *  The Weather Company Web
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
metadata {
	definition (name: "The Weather Company Web", namespace: "philippeportesppo", author: "Philippe Portes") {
		capability "refresh"
        capability "polling"
        capability "sensor"
        capability "capability.temperatureMeasurement"
        capability "capability.relativeHumidityMeasurement"
	}

	tiles(scale: 2) {

	standardTile("TWC_web", "device.TWC_web",  width: 6, height: 3,  canChangeIcon: false ) {
            state "default", icon: "https://business.weather.com/img/the-weather-company-logo.png", backgroundColor: "#999999"      }   
             
    standardTile("temperature", "device.temperature", width: 2, height: 2, canChangeIcon: false) {
            state "default", label: '${currentValue}º',unit:'${currentValue}', icon: "st.Weather.weather2", backgroundColor:"#999999"}  
        
	standardTile("humidity", "device.humidity", width: 2, height: 2, canChangeIcon: false) {
            state "default", label: '${currentValue}%', icon: "st.Weather.weather12", backgroundColor:"#999999"      }
            
	standardTile("TWCFeelsLikelevel", "device.TWCFeelsLikelevel",  width: 2, height: 2, canChangeIcon: false) {
            state "default",  label: '${currentValue}º',unit:'${currentValue}',icon: "https://raw.githubusercontent.com/philippeportesppo/AirMentorPro2_SmartThings/master/images/realfeel.png", backgroundColor:"#999999"}

	standardTile("TWCdewpointlevel", "device.TWCdewpointlevel",  width: 2, height: 2, canChangeIcon: false) {
            state "default", label: '${currentValue}º',unit:'${currentValue}',icon: "https://raw.githubusercontent.com/philippeportesppo/AirMentorPro2_SmartThings/master/images/dewpoint.png", backgroundColor:"#999999"}
            
    standardTile("TWC_Icon_UrlIcon", "device.TWC_Icon_UrlIcon", decoration: "flat",   width: 2, height: 2) {
                
                state "na",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/na.png"
                state "0", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/0.png"
                state "1", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/1.png"
                state "2", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/2.png"
                state "3", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/3.png"
                state "4", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/4.png"
                state "5", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/5.png"
                state "6", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/6.png"
                state "7", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/7.png"
                state "8", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/8.png"
                state "9", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/9.png"
                state "10",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/10.png"
                state "11",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/11.png"
                state "12",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/12.png"
                state "13",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/13.png"
                state "14",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/14.png"
                state "15",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/15.png"
                state "16",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/16.png"
                state "17",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/17.png"
                state "18",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/18.png"
                state "19",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/19.png"
                state "20",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/20.png"	
                state "21",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/21.png"
                state "22",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/22.png"
                state "23",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/23.png"
                state "24",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/24.png"
                state "25",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/25.png"
                state "26",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/26.png"
                state "27",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/27.png"
                state "28",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/28.png"
                state "29",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/29.png"
                state "30",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/30.png"
                state "31",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/31.png"
                state "32",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/32.png"
                state "33",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/33.png"
                state "34",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/34.png"
                state "35",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/35.png"
                state "36",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/36.png"
                state "37",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/37.png"
                state "38",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/38.png"
                state "39",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/39.png"
                state "40",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/40.png"
                state "41",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/41.png"
                state "42",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/42.png"
                state "43",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/43.png"
                state "44",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/44.png"
                state "45",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/45.png"
                state "46",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/46.png"
                state "47",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/47.png"
                
	}
            
    standardTile("refresh", "device.refresh", decoration: "flat", width: 2, height: 2) {
 		state "default", action:"refresh", icon:"st.secondary.refresh"
 		} 
	
    standardTile("weather", "device.weather", width: 6, height: 2) {
 		state "default", label:'${currentValue}'
 		} 

    standardTile("TWC_main", "device.TWC_main", decoration: "flat", width: 6, height: 4) 
    	{
               state "na",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/na.png"
                state "0", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/0.png"
                state "1", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/1.png"
                state "2", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/2.png"
                state "3", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/3.png"
                state "4", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/4.png"
                state "5", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/5.png"
                state "6", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/6.png"
                state "7", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/7.png"
                state "8", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/8.png"
                state "9", icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/9.png"
                state "10",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/10.png"
                state "11",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/11.png"
                state "12",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/12.png"
                state "13",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/13.png"
                state "14",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/14.png"
                state "15",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/15.png"
                state "16",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/16.png"
                state "17",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/17.png"
                state "18",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/18.png"
                state "19",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/19.png"
                state "20",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/20.png"	
                state "21",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/21.png"
                state "22",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/22.png"
                state "23",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/23.png"
                state "24",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/24.png"
                state "25",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/25.png"
                state "26",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/26.png"
                state "27",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/27.png"
                state "28",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/28.png"
                state "29",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/29.png"
                state "30",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/30.png"
                state "31",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/31.png"
                state "32",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/32.png"
                state "33",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/33.png"
                state "34",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/34.png"
                state "35",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/35.png"
                state "36",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/36.png"
                state "37",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/37.png"
                state "38",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/38.png"
                state "39",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/39.png"
                state "40",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/40.png"
                state "41",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/41.png"
                state "42",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/42.png"
                state "43",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/43.png"
                state "44",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/44.png"
                state "45",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/45.png"
                state "46",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/46.png"
                state "47",icon:"https://raw.githubusercontent.com/philippeportesppo/TheWeatherCompany_SmartThings/master/icons/47.png"  		}
	main("TWC_main")
	details(["TWC_web","temperature","humidity","TWCFeelsLikelevel","TWCdewpointlevel","TWC_Icon_UrlIcon","weather","refresh" ])
 	}
}

def installed() {
    

}

def updated() {

	log.debug "Executing 'updated'"
   
	refresh()
}

def poll(){
log.debug "Executing 'poll'"
    refresh()
}

String convertTemperature( float temperatureCelcius, unit)
{
	float value = temperatureCelcius 
    // No clue yet how to know if units are F or C in TWC interface so do nothing
    //if (unit =="F")
    //{
    //   value = temperatureCelcius * 1.8 + 32.0
    // }
    return value.toString().format(java.util.Locale.US,"%.1f", value)
}

// parse events into attributes
def parse(String description) {
	log.debug "Executing 'parse'"
    
   	state.snowalert=false
    state.stormalert=false
    state.rainmalert=false
	state.lowtempalert=false
	state.hightempalert=false
    state.lowhumidityalert=false
    state.highhumidityalert=false    
    refresh()    
    runEvery10Minutes(forcepoll)
    
}

def forcepoll()
{
	refresh()
}

// handle commands
def refresh() {
	log.debug "Executing 'refresh'"
    
    def mymap = getTwcConditions()
    
    log.debug mymap

	/*log.debug "state.snowalert=${state.snowalert}"
    log.debug "state.stormalert=${state.stormalert}"
    log.debug "state.rainmalert=${state.rainmalert}"
    log.debug "state.lowtempalert=${state.lowtempalert}"
    log.debug "state.hightempalert=${state.hightempalert}"
    log.debug "state.lowhumidityalert=${state.lowhumidityalert}"
    log.debug "state.highhumidityalert=${state.highhumidityalert}"*/


    log.debug "response feelslike_c: ${mymap['temperatureFeelsLike']}"
    log.debug "response dewpoint_c: ${mymap['temperatureDewPoint']}"
    log.debug "response relative_humidity: ${mymap['relativeHumidity']}"
    log.debug "response temp_c: ${mymap['temperature']}"
    log.debug "response weather: ${mymap['wxPhraseMedium']}"

    //log.debug "Generating events for UX refresh"
    def temperatureScale = getTemperatureScale()

    // UnderGround Weather references
    sendEvent(name: "TWCFeelsLikelevel", value: mymap['temperatureFeelsLike'], unit: temperatureScale)
    sendEvent(name: "TWCdewpointlevel", value: mymap['temperatureDewPoint'], unit: temperatureScale)
    sendEvent(name: "humidity", value:  mymap['relativeHumidity'])
    sendEvent(name: "temperature", value: mymap['temperature'], unit: temperatureScale)
    sendEvent(name: "TWC_Icon_UrlIcon", value: mymap['iconCode'])
    sendEvent(name: "TWC_main", value: mymap['iconCode'])
    sendEvent(name: "weather", value: mymap['wxPhraseMedium'], display:true, isStateChange: true)


    if (getDataValue("TWCsnowalert")=="True" && mymap['wxPhraseMedium'].contains("Snow"))
    {
        // if ( state.snowalert == false) {
            sendEvent(name:"Alert", value: "TWC Snow Alert!", display:true)
        //    state.snowalert=true  }
    }
    else
        state.snowalert=false

    if (getDataValue("TWCrainalert")=="True" && (mymap['wxPhraseMedium'].contains("Rain") || mymap['wxPhraseMedium'].contains("Shower")))
    {
        // if ( state.rainalert == false) {
            sendEvent(name:"Alert", value: "TWC Rain Alert!", display:true)
        //    state.rainalert=true  }
    }
    else
        state.rainalert=false

    if (getDataValue("TWCstormalert")=="True" && mymapmymap['wxPhraseMedium'].contains("Storm"))
    {
        // if ( state.stormalert == false) {
            sendEvent(name:"Alert", value: "TWC Storm Alert!", display:true)
        //    state.stormalert=true  }
    }
    else
        state.stormalert=false

    if (getDataValue("TWClowtempalert")!="null") {
        if (getDataValue("TWClowtempalert").toFloat() >= mymap['temperature'].toFloat())
        {

            //if ( state.lowtempalert == false) {
                sendEvent(name:"Alert", value: "TWC Low Temperature Alert!", display:true)
            //    state.lowtempalert=true }
        }
        else
            state.lowtempalert=false
    }

    if (getDataValue("TWChightempalert")!="null") {
        if (getDataValue("TWChightempalert").toFloat() <= mymap['temperature'].toFloat())
        {

            //if ( state.hightempalert == false) {
                sendEvent(name:"Alert", value: "TWC High Temperature Alert!", display:true)
            //    state.hightempalert=true }
        }
        else
            state.hightempalert=false
    }

    if (getDataValue("TWClowhumidityalert")!="null") {
        if (getDataValue("TWClowhumidityalert").toFloat() >= mymap['relativeHumidity'].toFloat())
        {

            //if ( state.lowhumidityalert == false) {

                sendEvent(name:"Alert", value: "TWC Low Humidity Alert!", display:true)
            //    state.lowhumidityalert=true }
        }
        else
        {
            state.lowhumidityalert=false

        }
    }

    if (getDataValue("TWChighhumidityalert")!="null") {

        if (getDataValue("TWChighhumidityalert").toFloat() <= mymap['relativeHumidity'].toFloat())
        {
            //if ( state.highhumidityalert == false) {
                sendEvent(name:"Alert", value: "TWC High Humidity Alert!", display:true)
            //    state.highhumidityalert=true }
        }
        else
            state.highhumidityalert=false
    }

}    