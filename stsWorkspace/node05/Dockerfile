FROM node:lts-alpine
# ENV NODE_ENV=production
WORKDIR /usr/src/app
COPY ["package.json", "package-lock.json*", "npm-shrinkwrap.json*", "./"]
# RUN npm install --production --silent && mv node_modules ../
RUN npm install
COPY . .
EXPOSE 3000
RUN chown -R node /usr/src/app
# USER node
CMD ["npm", "start"]
# podman run -it -d -p 3000:3000 --rm node05:v2
