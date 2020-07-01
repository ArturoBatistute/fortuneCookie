# Overview:

Sharing SpringBoot application with Docker images

## Intro:

First, create a simple API, in this case we create the fortuneCookie API.

## Tips:

**1º Create .jar file:**

If you are using gradle on Intellij IDE, go to gradle bar at top right, go to Tasks->Build->assemble.

**2º Creating application container**

Dockerfile - {fortuneCookie/Dockerfile}
 -> The first line we determine java version from DockerHub;
 -> The second one we copy and rename our app file;
 -> The last one we execute the command.

To create docker image, run: *sudo docker build -t "your User"/fortunecookie:v1 .*
//Don't forget the dot at end, use lower case!!

Finally, we are Done! Time to test, run: *docker run -it -p 8080:8080 "your user"/fortunecookie:v1*

Go to your browser: *localhost:8080*

So, you create the API, the docker file and the container for your app! Well done!

**3º Sharing Containers**

First, create a .tar from your container. Run: ***docker save "your user"/fortunecookie:v1 > fortunecookie.tar***

After copy the .tar to other system, its time to RUN THIS API!

In the .tar folder, open the terminal and run: ***docker load --input fortunecookie.tar***
-This command load a image from a .tar archive.

Successful I guess? So, run: ***docker images***
->This command list images

And you can see the image of your app.

Finally, run: ***docker run --publish 8080:8080 --detach "Name of the image showed in the previous list"***
-> 8080:8080 : You can set the containers port. localPort:ContainerPort;
-> --detach : Set Docker to run this container in the background.

Time to test, go to your browser: ***localhost:8080***

**Well done young Padawan!**