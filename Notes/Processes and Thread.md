# Processes and Threads

In concurrent programming, there are two basic units of execution:
* processes
* threads

## Processes
A process has a self-contained execution environment.A process generally has a complete private 
set of basic run-time resources; inparticular; each process has its own memory space.

## Threads
Threads are sometimes called lightweight processes.Both processes and threads provide an execution
environment, but creating a new thread requires fewer resources than creating a new process.

### Thread Objects

* Each thread is associated with an instance of the class **Thread**
* Two best stratergies for using Threads:
	* To directly control thread creation and management, simply instantiate Thread each time
	the application needs to initiate an asunchronous task.
	* To abstract thread managment from the rest of your application, pass the application's
	tasks to an executor.

## Synchronization
Threads communicate primarily by sharing access to fields and the objects reference fields refer to. This form of communication is extremely efficient, but makes two kinds of errors possible: thread interference and memory consistency errors. The tool needed to prevent these errors is synchronization.
	
	








