## Assumptions

- We are assuming that there can be multiple admins but all of them might not have same privileges for example: support staffs have slightly more privilege than normal app user and there might be very few people who have all the admin privileges for example only admin can add/remove a vehicle, add/remove docking stations and there would be maintenance staff who would constantly track the vehicle conditions.

- We assume that the dues of any student, teacher, and staff would be settled by institute's financial department at the end of the semester.

- When Qr code is scanned, startTrip function in the TripManager gets called.

- We assume that when a user gives feedback for a trip, he or she would also mention any kind of difficulties and faults that he/she faces with that vehicle.

- We will be charging bicycles based on the duration of the trip and for mopeds and bikes, we charge based on duration and distance.

- When the trip manager calls the payment manager, payment is done through the deduct amount function it is achieved by following helper functions. The remaining functions are helper functions

- The tripFareCalculator class has a baseFare variable which has base fares corresponding to bike, bicycle, and moped (we are assuming that any model of bike same base fare would be charged and likewise for bicycle, moped)
