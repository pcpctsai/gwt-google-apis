/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.maps.client.event;

import com.google.gwt.maps.client.overlay.Marker;

import java.util.EventObject;

/**
 * Provides an interface to implement in order to receive MapEvent.MOUSEOUT
 * events from the {@link Marker}.
 */
public interface MarkerMouseOutHandler {

  /**
   * Encapsulates the arguments for the MapEvent.MOUSEOUT event on a
   * {@link Marker}.
   */
  @SuppressWarnings("serial")
  class MarkerMouseOutEvent extends EventObject {

    public MarkerMouseOutEvent(Marker source) {
      super(source);
    }

    /**
     * Returns the instance of the map that generated this event.
     * 
     * @return the instance of the map that generated this event.
     */
    public Marker getSender() {
      return (Marker) getSource();
    }
  }

  /**
   * Method to be invoked when a MapEvent.MOUSEOUT event fires on a
   * {@link Marker}.
   * 
   * @param event contains the properties of the event.
   */
  void onMouseOut(MarkerMouseOutEvent event);
}
