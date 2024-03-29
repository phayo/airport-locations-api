dev:
	mvn spring-boot:run -Dspring-boot.run.profiles=dev

dev-migrate:
	mvn spring-boot:run -Dspring.profiles.active=dev flyway:migrate

run:
	mvn spring-boot:run 
# -Dspring.profiles.active=prod

prod-migrate:
	mvn spring-boot:run -Dspring.profiles.active=prod flyway:migrate