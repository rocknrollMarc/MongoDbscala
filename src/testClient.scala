import com.scalainaction.mongo._
import com.mongodb.BasicDBObject

object TestClient extends App {

  def client = new MongoClient
  def db = client.db("mydb")
  for(name <- db.collectionNames) println(name)
}
