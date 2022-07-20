http://localhost:8080/resteasy/registry
http://localhost:8080/library/books

mvn jetty:run

Possible Modules
archivia
openldap
postgres
redis
elk (log aggregator)
openldap


docker-compose -f docker/docker-compose.yml down --rmi all
