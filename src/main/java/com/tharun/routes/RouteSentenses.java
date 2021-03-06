package com.tharun.routes;
// Generated Feb 4, 2013 5:14:58 PM by Hibernate Tools 3.2.1.GA



/**
 * RouteSentenses generated by hbm2java
 */
public class RouteSentenses  implements java.io.Serializable {


     private Integer sentenseId;
     private String sentenses;
     private String routeIdUrl;
     private Integer routeDescriptionPosition;

    public RouteSentenses() {
    }

	
    public RouteSentenses(String sentenses, String routeIdUrl) {
        this.sentenses = sentenses;
        this.routeIdUrl = routeIdUrl;
    }
    public RouteSentenses(String sentenses, String routeIdUrl, Integer routeDescriptionPosition) {
       this.sentenses = sentenses;
       this.routeIdUrl = routeIdUrl;
       this.routeDescriptionPosition = routeDescriptionPosition;
    }
   
    public Integer getSentenseId() {
        return this.sentenseId;
    }
    
    public void setSentenseId(Integer sentenseId) {
        this.sentenseId = sentenseId;
    }
    public String getSentenses() {
        return this.sentenses;
    }
    
    public void setSentenses(String sentenses) {
        this.sentenses = sentenses;
    }
    public String getRouteIdUrl() {
        return this.routeIdUrl;
    }
    
    public void setRouteIdUrl(String routeIdUrl) {
        this.routeIdUrl = routeIdUrl;
    }
    public Integer getRouteDescriptionPosition() {
        return this.routeDescriptionPosition;
    }
    
    public void setRouteDescriptionPosition(Integer routeDescriptionPosition) {
        this.routeDescriptionPosition = routeDescriptionPosition;
    }




}


