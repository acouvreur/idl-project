# Projet fil rouge

*Alexis Couvreur - Master 2 IFI*

## Sujet 2 : Smart Home Data Fusion DSL

### Installation

1. `git clone https://github.com/acouvreur/idl-project`
2. Start Gemoc Studio v3.1.0
3. File -> Import... -> General -> Existing Project into Workspace
4. Root directory is the repository Root
5. Check "Search for nested projects"
6. You should see all the projects ready to be imported
7. Click finish and the projects are imported

### Playground

In the playground folder you'll find a basic project with a *myHome.launch* configuration to run the *myHome.shome* file.

### Example

Here is a valid program that has few patterns and monitoring

```

Home {
	eventFile "eventFile.csv"
	rooms{
		Room "Bedroom" {
				AnalogSensor "bed",
				DigitalSensor "door"
		},
		Room "Bathroom" {
				DigitalSensor "door",
				DigitalSensor "toilet",
				DigitalSensor "flush",
				DigitalSensor "shower"
		}
	}
	
	persons {
		Person "Alexis" { 
			left-ankle ID "01" 
			right-ankle ID "02"
			belt ID "03"
			chest ID "04"
		}
	}
	
	patterns {
		Pattern "Sleeping" {
			{
				(Alexis is laying and "Bedroom.bed" = 1.0) since 10 minutes
			}
		},
		Pattern "Dead" {
			{
				(Alexis is laying and "Bedroom.bed" = 0.0) since 10 minutes
			}, {
				("Bedroom.door" = 0.0) since 60 minutes
			}
		}
	}
	
	start
}
```

### Event File

Here is a basic event file

```csv
2012-11-14 11:11:44,bedroom,door,1.0
2012-11-14 11:27:27,bedroom,bed,0.0
2012-11-14 11:35:46,alexis,2.86,2.5,1.78,1.76
2012-11-14 11:47:43,alexis,2.86,2.5,1.78,1.76
2012-11-14 11:49:24,bedroom,bed,1.0
2012-11-14 11:58:12,alexis,2.86,2.5,1.78,1.76
```

There is two different lines :

- *time* , *room* , *sensor* , *value*
- *time* , *person* , *chest_y* , *belt_y* , *ankleL_y* , *ankleR_y*

With this naive parsing there is a problem if a person has the same name as a room.