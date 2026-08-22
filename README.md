A simple smart home appliances controller system using Java.

The application uses an Appliance interface to provide a common
turnoff functionality for all appliances such as Light, Fan, Air Conditioner.

Each appliance implements its own turnOff() behavior:

	1. Light: The light can be turned off by setting a power switch to the "off".
	2. Fan: The fan can be turned off by reducing its speed to 0.
	3. Air Conditioner: The air conditioner can be turned off by setting the thermostat to 0.

The system uses polymorphism to operate on all appliances
without depending on their specific implementations and in future we can add more appliances without changing existing functionality.

The annual update operation only turns off the appliances, as required
by the assessment. It does not perform any additional appliance actions.
