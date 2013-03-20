package com.ngp



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(FooController)
class FooControllerTests {

    void testIndexRender() {
		controller.index()
		assert response.text == 'Boo!!'
		assertFalse response.text == 'Just kidding..'
    }
}
