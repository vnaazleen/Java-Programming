Files in Java
-------------
* import java.io.File;

* To create a file object
```
File myFile = new File("Path");
```

Reading from a file
-------------------

* To read the files, import java.io.FileReader

* Declare & Initilize a file reader 
```
FileReader reader = new FileReader("Path");
```

* If file doesn't exist then FileReader will return a IOException


* To read from the file use *read* method
```
int c;
while ((c = reader.read()) != -1)
	System.out.print((char)c);
```

* After reading the file you should close the reader using close() method
```
reader.close()
```

Writing to a file:
-----------------
* to write to files, import java.io.FileWriter
* Declare & Initilize a file writer
```
FileWriter reader = new FileWriter("Path");
```

* If file doesn't exist then FileWriter will return a IOException

* Declare & Initilize a file writer
```
FileWriter writer = new FileWriter("Path");
```

* To write to the file use *write* method 

```
writer.write(String);
```


* After writing to the file you should close the writer using *close* method
```
writer.close()

```

Other Methods:
--------------

* Checking whether a file exists or not we use *exits* method
```
myFile.exists()
```

* To create a new file we use *createNewFile* method, it returns true on success and false on failure
* To get the absolute path we use *getAbsolutePath* method
* To find number of characters in a file, we use *length* method
* To make the file ready only we can use myFile.setWritable(false)


