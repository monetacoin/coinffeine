package coinffeine.peer.exchange.micropayment

import coinffeine.model.exchange.ExchangeId
import coinffeine.peer.exchange.protocol.MicroPaymentChannel.IntermediateStep

/** Payment description formatter */
private[micropayment] object PaymentDescription {
  def apply(exchangeId: ExchangeId, step: IntermediateStep): String =
    s"Payment for $exchangeId, step ${step.value}"
}
