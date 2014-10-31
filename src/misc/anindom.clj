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


(data-entry "/home/thao/recipes" "recipes" "|recipes|appetizer")
(data-entry "/home/thao/recipes" "recipes" "|recipes|bake")
(data-entry "/home/thao/recipes" "recipes" "|recipes|breakfast")
(data-entry "/home/thao/recipes" "recipes" "|recipes|dessert")
(data-entry "/home/thao/recipes" "recipes" "|recipes|diner")
(data-entry "/home/thao/recipes" "recipes" "|recipes|drink")
(data-entry "/home/thao/recipes" "recipes" "|recipes|mix")
(data-entry "/home/thao/recipes" "recipes" "|recipes|recepis-for-holiday")
(data-entry "/home/thao/recipes" "recipes" "|recipes|salads")
(data-entry "/home/thao/recipes" "recipes" "|recipes|seasonal-recipes")
(data-entry "/home/thao/recipes" "recipes" "|recipes|vegetables")


(data-entry "/home/thao/homegarden" "homegarden" "|homegarden|decor-for-holiday")
(data-entry "/home/thao/homegarden" "homegarden" "|homegarden|diy")
(data-entry "/home/thao/homegarden" "homegarden" "|homegarden|garden-landscape")
(data-entry "/home/thao/homegarden" "homegarden" "|homegarden|holidays")
(data-entry "/home/thao/homegarden" "homegarden" "|homegarden|interior")



(def connection (DriverManager/getConnection connection-str username password))
(def stmt 	(.createStatement connection))

(.executeUpdate stmt "INSERT INTO `articles`(`main`, `path`, `filename`) VALUES ('recipes', '|recipes|dinner|', 'faq.php')")

(.executeQuery stmt "SELECT * from `articles`")

INSERT INTO `articles`(`main`, `path`, `filename`) VALUES ('recipes', '|recipes|dinner|', 'faq.php')
/home/thao/Downloads/anindom.com/public_html



