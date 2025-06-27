package daetonam.loKal

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration

@SpringBootApplication
class loKalApplication {

    static void main(String[] args) {
        SpringApplication.run(loKalApplication, args)
    }

}
