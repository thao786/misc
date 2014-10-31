(import 'java.sql.DriverManager)
(import 'java.io.File)


(def connection-str "jdbc:mysql://anindom.com/ganzya_articles")
(def username "ganzya")
(def password "green99")


(defn data-entry [folderpath main paths]
	(doseq [file (.listFiles (File. folderpath))]
			(let [connection 	(DriverManager/getConnection connection-str username password)			
				stmt 	(.createStatement connection)
				filename 	(.getName file)
				query 	(str "INSERT INTO `articles`(`main`, `path`, `filename`) VALUES ('"
							 main "', '" paths "', '" filename "')")]				
					(do 
						(.executeUpdate stmt query)
						(.close connection)
						(prn query)))))


(data-entry "/home/thao/prolife" "profile" "|profile|")


(def connection (DriverManager/getConnection connection-str username password))
(def stmt 	(.createStatement connection))

(.executeUpdate stmt "INSERT INTO `articles`(`main`, `path`, `filename`) VALUES ('recipes', '|recipes|dinner|', 'faq.php')")

(.executeQuery stmt "SELECT * from `articles`")

INSERT INTO `articles`(`main`, `path`, `filename`) VALUES ('recipes', '|recipes|dinner|', 'faq.php')
/home/thao/Downloads/anindom.com/public_html



