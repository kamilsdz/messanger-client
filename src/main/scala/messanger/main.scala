package messager

import messager.services.{Notifier}

object Main extends App {
  Notifier.call()
}
