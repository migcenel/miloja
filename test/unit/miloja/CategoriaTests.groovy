package miloja



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Categoria)
class CategoriaTests {

    void testDeberiaGuardarUnaCategoria() {
       Categoria miCategoria = new Categoria (
		   descripcion:'Plato Principal')
	   
	   assertTrue miCategoria.validate()
	   assertEquals ('Plato Principal', miCategoria.descripcion)	   
    }
}
