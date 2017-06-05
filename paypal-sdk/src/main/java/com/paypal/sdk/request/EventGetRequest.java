// This class was generated on Mon, 05 Jun 2017 14:29:09 PDT by version 0.01 of Braintree SDK Generator
// EventGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"event.get","Description":"Shows details for a webhook event notification, by ID.","Parameters":[{"Type":"string","VariableName":"event_id","Description":"The ID of the webhook event notification for which to show details.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Event","VariableName":"","Description":"A webhook event notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/notifications/webhooks-events/{event_id}","Visible":true,"ExpectedStatusCode":200}

package com.paypal.sdk.request;

import com.braintreepayments.http.HttpRequest;
import com.paypal.sdk.object.Event;


/**
 * Shows details for a webhook event notification, by ID.
 */
public class EventGetRequest extends HttpRequest<Event> {

    public EventGetRequest() {
    	super("/v1/notifications/webhooks-events/{event_id}?", "GET", Event.class);
    	header("Content-Type", "application/json");
    }
    
    public EventGetRequest eventId(String eventId) {
        path(path().replace("{event_id}", String.valueOf(eventId)));
        return this;
    }
}