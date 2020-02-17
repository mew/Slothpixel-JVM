package zone.nora.slothpixel.example.scala

import zone.nora.slothpixel.Slothpixel

object GetSkyblockProfilesExampleScala {
  def main(args: Array[String]): Unit = {
    // Make an instance of the Slothpixel API.
    val slothpixel = new Slothpixel
    // Save a request as a local variable.
    val profiles = slothpixel.getSkyblockProfiles("bspwm")

    // Get data for each profile.
    profiles.foreach(profile => {
      println(s"Profile id: ${profile.getProfileId}")
      println(s"Profile name: ${profile.getCuteName}")
      println("Members:")
      profile.getMembers.forEach(member => println(member))
    })
  }
}