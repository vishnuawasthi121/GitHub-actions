Quick setup — if you’ve done this kind of thing before
or	
https://github.com/vishnuawasthi121/GitHub-actions.git
Get started by creating a new file or uploading an existing file. We recommend every repository include a README, LICENSE, and .gitignore.

…or create a new repository on the command line
echo "# GitHub-actions" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/vishnuawasthi121/GitHub-actions.git
git push -u origin main
…or push an existing repository from the command line
git remote add origin https://github.com/vishnuawasthi121/GitHub-actions.git
git branch -M main
git push -u origin main


Command to set origin 

	git push --set-upstream origin poc
	
	
## TODO  : 
	1. Docker compose
		1. awesome-compose

## Containerize an application

	1.https://docs.docker.com/get-started/workshop/02_our_app/
	
	
	
## Useful commands 

	1. Build docker image 
	> docker build -t registration-service .
	
	2. run the Docker image 
	> docker run -d -p 8080:8090 registration-service:latest	
	
	Running container with volume 
	> docker run --name RegService-01 -d -it -p 8090:8080 --mount type=volume,src=RegLogs,dst=/apps reg-with-volume
	
<br>	
	PS D:\JavaBasics\registration-service> docker volume create RegLogs

RegLogs

<br>
PS D:\JavaBasics\registration-service> docker inspect RegLogs
[
    {
        "CreatedAt": "2025-01-05T03:21:18Z",
        "Driver": "local",
        "Labels": null,
        "Mountpoint": "/var/lib/docker/volumes/RegLogs/_data",
        "Name": "RegLogs",
        "Options": null,
        "Scope": "local"
    }
]

## Youtube ref 
	1.https://www.youtube.com/watch?v=r_LgmqejAkA&ab_channel=Abhishek.Veeramalla
	
	2.https://www.youtube.com/playlist?list=PLdpzxOOAlwvIKMhk8WhzN1pYoJ1YU8Csa	
	
## Ref 
	1.https://www.youtube.com/watch?v=zCsbp_iBTq8&ab_channel=PiyushGarg	
	2.https://kodekloud.com/blog/keep-docker-container-running/
	3.https://hub.docker.com/_/openjdk
	4. Docker training resournces 
		1. https://learn.kodekloud.com/user/courses/docker-training-course-for-the-absolute-beginner/module/672dc9a2-52ce-467f-b00c-c2f16185479b/lesson/8f626b4e-ee33-487c-866a-a0b5c3b07a74
	5. https://docs.docker.com/reference/dockerfile/	
	
	6. Docker volume references 
		1.https://stackoverflow.com/questions/54374724/docker-container-save-logs-on-the-host-directory
	
## Timezone settings 
	1.https://www.wikihow.com/Change-the-Timezone-in-Linux	