package miloja

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Restaurante)
class RestauranteTests {

    void testDeberiaGuardarUnRestaurante() {
    	Restaurante miRestaurant = new Restaurante(
			nombre:'Prueba', 
			rif:'J-10000000',						
			urlImagen:'http://static.photaki.com/milhoja-pasteler_332177.jpg'
			)
		assertTrue miRestaurant.validate()	
		miRestaurant.save() 
		assertEquals ('Prueba', Restaurante.get(1).nombre)			
	}
}
