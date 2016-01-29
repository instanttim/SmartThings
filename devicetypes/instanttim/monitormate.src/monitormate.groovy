/**
 *  MonitorMate
 *
 *  Copyright 2016 Timothy Martin
 *
 */

metadata {
	definition (name: "MonitorMate", namespace: "instanttim", author: "Timothy Martin") {
		capability "Energy Meter"
		capability "Power Meter"
	}

	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
	}
    
    preferences {
		input "jsonURL", "text", title: "URL", description: "The URL to access your to your MonitorMate installation.", defaultValue: "http://your.server/monitormate/", required: tue, displayDuringSetup: true
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'energy' attribute
	// TODO: handle 'power' attribute

}