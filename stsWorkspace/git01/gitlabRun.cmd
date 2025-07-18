@echo off
docker run --restart always --hostname localhost -p 4000:80 -v ./gitlab/config:/etc/gitlab -v ./gitlab/data:/var/opt/gitlab -v ./gitlab/logs:/var/log/gitlab gitlab/gitlab-ce
