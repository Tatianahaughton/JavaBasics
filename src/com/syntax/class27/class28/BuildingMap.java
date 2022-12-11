package com.syntax.class27.class28;

import java.util.HashMap;
import java.util.Map;

public class BuildingMap {
    public static void main(String[] args) {
        /*Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map*/

        Map<Integer, String> building = new HashMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Wells Fargo");
        building.put(4, "Chevy Chase");
        building.put(5, "Bank of America");
        building.put(6, "Geico");
        building.put(7, "State Farm");

        var entrySet=building.entrySet();

        building.replace(4,"something else");
        building.remove(7);
        System.out.println(building);

        }
    }

