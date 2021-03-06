package zone.nora.slothpixel.example.scala

import zone.nora.slothpixel.Slothpixel

object GetSkyblockAuctionExampleScala {
  def main(args: Array[String]): Unit = {
    // Make an instance of the Slothpixel API.
    val slothpixel = new Slothpixel
    // Save a request as a local variable.
    val auctions = slothpixel.getSkyblockAuctions()

    // Get data for each auction.
    auctions.foreach(auction => {
      println(s"Item: ${auction.getItem.getName}")
      println(s"Seller: ${auction.getAuctioneer}")
      println("Bids:")
      auction.getBids.forEach(bid => {
        println(s"${bid.getAmount} by ${bid.getBidder}")
      })
    })
  }
}
