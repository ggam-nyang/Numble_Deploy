package numble.deploy.server.temp

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

private class TempTest {

    @Test
    fun temp() {
        val a = 1
        val b = a

        println("test run retry")
        Assertions.assertThat(a).isEqualTo(b)
    }
}