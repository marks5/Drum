package environment

object Environment {

    const val host = "API_HOST"
    const val key = "API_KEY"

    object Debug {
        const val host = "\"http://one.zetai.info/\""
        const val key = "\"xxxxxx\""
    }

    object Release {
        const val host = "\"http://one.zetai.info/\""
        const val key = "\"xxxxxx\""
    }
}