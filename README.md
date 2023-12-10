# addressSearch

addressSearch is a Java Swing application that allows searching for addresses and displaying them on a map.

## Features

- Search for addresses using the Google Maps Distance Matrix API
- Display location on static Google Map image
- Get driving distance and duration between searched address and default start address
- Save searched addresses

## Usage

The main interface allows entering an address, reference point, and complement. Clicking "Search" will lookup the address on Google Maps and display it on the map view. The driving distance and duration is also shown.

Addresses can be saved by clicking the "Save" button after searching.

The map zoom can be adjusted using the slider below the map.

## Requirements

- Java 8+
- Google Maps API key (set in apiKey.txt file)

## Building

The project was created in NetBeans. Simply open the project in NetBeans and build/run from there.

## TODO

- Allow setting default start address
- Improve address saving
- Add location autocomplete/suggestions
