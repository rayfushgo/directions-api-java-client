package com.graphhopper.routeopt.client.model;

import java.util.Objects;
import com.graphhopper.routeopt.client.model.Algorithm;
import com.graphhopper.routeopt.client.model.Relation;
import com.graphhopper.routeopt.client.model.Service;
import com.graphhopper.routeopt.client.model.Shipment;
import com.graphhopper.routeopt.client.model.Vehicle;
import com.graphhopper.routeopt.client.model.VehicleType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class Request   {
  
  @SerializedName("vehicles")
  private List<Vehicle> vehicles = new ArrayList<Vehicle>();
  
  @SerializedName("vehicle_types")
  private List<VehicleType> vehicleTypes = new ArrayList<VehicleType>();
  
  @SerializedName("services")
  private List<Service> services = new ArrayList<Service>();
  
  @SerializedName("shipments")
  private List<Shipment> shipments = new ArrayList<Shipment>();
  
  @SerializedName("relations")
  private List<Relation> relations = new ArrayList<Relation>();
  
  @SerializedName("algorithm")
  private Algorithm algorithm = null;
  

  
  /**
   * An array of vehicles that can be employed
   **/
  @ApiModelProperty(value = "An array of vehicles that can be employed")
  public List<Vehicle> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  
  /**
   * An array of vehicle types
   **/
  @ApiModelProperty(value = "An array of vehicle types")
  public List<VehicleType> getVehicleTypes() {
    return vehicleTypes;
  }
  public void setVehicleTypes(List<VehicleType> vehicleTypes) {
    this.vehicleTypes = vehicleTypes;
  }

  
  /**
   * An array of services
   **/
  @ApiModelProperty(value = "An array of services")
  public List<Service> getServices() {
    return services;
  }
  public void setServices(List<Service> services) {
    this.services = services;
  }

  
  /**
   * An array of shipments
   **/
  @ApiModelProperty(value = "An array of shipments")
  public List<Shipment> getShipments() {
    return shipments;
  }
  public void setShipments(List<Shipment> shipments) {
    this.shipments = shipments;
  }

  
  /**
   * An array of relations
   **/
  @ApiModelProperty(value = "An array of relations")
  public List<Relation> getRelations() {
    return relations;
  }
  public void setRelations(List<Relation> relations) {
    this.relations = relations;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Algorithm getAlgorithm() {
    return algorithm;
  }
  public void setAlgorithm(Algorithm algorithm) {
    this.algorithm = algorithm;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Request request = (Request) o;
    return Objects.equals(vehicles, request.vehicles) &&
        Objects.equals(vehicleTypes, request.vehicleTypes) &&
        Objects.equals(services, request.services) &&
        Objects.equals(shipments, request.shipments) &&
        Objects.equals(relations, request.relations) &&
        Objects.equals(algorithm, request.algorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicles, vehicleTypes, services, shipments, relations, algorithm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Request {\n");
    
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("    vehicleTypes: ").append(toIndentedString(vehicleTypes)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
