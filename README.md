# gestion-immo-spring-boot

Mise en place d'un système de gestion immobilière <br/>
<ul>
    <li>Système de gestion des contrats 
      <ul>
        <li>L'option imprimer en PDF</li>
        <li>Envoie d'un mailing au client par rapport au règlement de location ou autre </li>
      </ul>
    </li>
    <li>Système de gestion factution -  avec l'option imprimer en PDF</li>
    <li>Système de gestion rapport au format Excel</li>
</ul>

# Création de projet avec Spring Initializr
`https://start.spring.io/`

Les starters dont nous aurons besoin

<ul>
    <li>lombok </li>
    <li>spring web </li>
    <li>spring data jpa </li>
    <li>spring mysql driver </li>
    <li>spring security </li>
    <li>spring boot DevTools </li>
</ul>

<img width="1792" alt="Capture d’écran 2022-04-11 à 17 52 11" src="https://user-images.githubusercontent.com/47887636/162799849-e4290fa2-93aa-4681-90bc-bb4c7cb1be37.png">


# Modification du fichier applications.properties

```javascript
spring.datasource.url = jdbc:mysql://localhost:3306/immobilierdb?createDatabaseIfNotExist=true
spring.datasource.username = root
spring.datasource.password =
spring.datasource.driverClassName = com.mysql.jdbc.Driver
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
spring.thymeleaf.cache=false
#Server Error 404
server.error.whitelabel.enabled=false

#Tomcat configuration
server.port=9000
```
