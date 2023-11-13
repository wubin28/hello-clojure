;; declares the namespace for the file
(ns hello-clojure.core)

;; declares a function named foo
(defn say-welcome
  ;; The docstring "I don't do a whole lot." provides a brief description of the function's purpose
  "I don't do a whole lot."
  ;; The argument what is bound to the value passed to the function when it is called.
  [what]
  ;; The body of the function is a single expression that prints a message to the console.
  (println what "Hello, World!"))

;; This defines the main function for the project, -main, which can take any number of arguments
;; (denoted by & args). The main function calls the foo function with the argument "Clojure",
;; resulting in the output "Clojure Hello, World!" when the project is run.
(defn -main [& args]
  (say-welcome "Clojure"))

;; This makes the main function available to the JVM as the entry point for the project.
;; The -main function is explicitly called at the end of your script, and also implicitly
;; called by the Clojure runtime when you run the program. The Clojure runtime automatically
;; calls the -main function if it's defined, so you don't need to call it manually.
;; (-main)

;; In Clojure, the name -main for the main function has a convention-based significance, particularly when working
;; with the Leiningen build tool.
;;
;;Convention: By convention, many Clojure applications use -main as the name of the entry point function. It's not a
;; strict requirement enforced by the language itself, but rather a convention established by tools and the community.
;;
;;Leiningen: When using Leiningen (a popular build tool for Clojure), the :main key in the project.clj file is used
;; to specify the namespace and function that should be executed when the project is run. The function named -main
;; in the specified namespace is often used as the entry point.
;;
;;Command-Line Execution: If you package your application as a standalone JAR file, the -main function can be
;; invoked as the entry point when you run the JAR.
;;
;;Leading Dash: The leading dash (-) in -main is a naming convention in Clojure to indicate that a function is
;; intended to be used as a Java method. When Clojure code is compiled to Java bytecode, functions with names that
;; start with a dash can be invoked as Java instance methods on their containing object.
;;
;;In summary, while you could technically name the main function something other than -main, using -main aligns
;; with community conventions, makes your intentions clear, and ensures compatibility with tools like Leiningen.