package guide.example._1_building_a_walking_skeleton

import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status.Companion.OK
import org.http4k.server.Http4kServer
import org.http4k.server.Jetty
import org.http4k.server.asServer

fun MyMathServer(port: Int): Http4kServer = { _: Request -> Response(OK) }.asServer(Jetty(port))