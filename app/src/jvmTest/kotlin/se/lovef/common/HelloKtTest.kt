package se.lovef.common

import org.junit.Test
import se.lovef.assert.v1.shouldEqual

class HelloKtTest {

    @Test fun `say hello`() {
        hello("me", "you") shouldEqual "Hello me and you"
    }
}
