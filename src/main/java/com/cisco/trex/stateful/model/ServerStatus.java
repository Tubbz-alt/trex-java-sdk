package com.cisco.trex.stateful.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public class ServerStatus {

  public enum State {
    @JsonProperty("0")
    IDLE,

    @JsonProperty("1")
    LOADED,

    @JsonProperty("2")
    PARSING,

    @JsonProperty("3")
    BUILDING,

    @JsonProperty("4")
    TRANSMITTING,

    @JsonProperty("5")
    CLEANUP;
  }

  @JsonProperty("epoch")
  private int epoch;

  @JsonProperty("state")
  private State state;

  @JsonProperty("state_profile")
  private Map<String, State> stateProfile;

  @JsonProperty("epoch")
  public int getEpoch() {
    return epoch;
  }

  @JsonProperty("epoch")
  public void setEpoch(int epoch) {
    this.epoch = epoch;
  }

  @JsonProperty("state")
  public State getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(State state) {
    this.state = state;
  }

  @JsonProperty("state_profile")
  public Map<String, State> getStateProfile() {
    return stateProfile;
  }

  @JsonProperty("state_profile")
  public void setStateProfile(Map<String, State> stateProfile) {
    this.stateProfile = stateProfile;
  }
}
