package org.opensky.libadsb.msgs;

/*
 *  This file is part of org.opensky.libadsb.
 *
 *  org.opensky.libadsb is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  org.opensky.libadsb is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with org.opensky.libadsb.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * Represents the flight status of an aircraft. Unknown by default.
 */
public enum FlightStatus {

    /**
     * Flight status has indicated that the flight is Airborne
     */
    AIRBORNE,

    /**
     * Flight status indicates that the aircraft is on the ground
     */
    ON_GROUND,

    /**
     * Flight status is unknown (Default)
     */
    UNKNOWN

}
