(defproject hello-clojure "0.1.0-SNAPSHOT"                  ; defines a project
  :description "FIXME: write description"                   ; project's description
  :url "http://example.com/FIXME"                           ;project's URL
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"} ; the license under which the project is distributed
  :dependencies [[org.clojure/clojure "1.11.1"]]            ; dependencies for the project
  :repl-options {:init-ns hello-clojure.core}               ; sets the namespace to be loaded when starting a REPL
  ; Specifies the main function that will be executed when the project is run.
  ; The function is named -main and resides in the hello-clojure.core namespace.
  :main hello-clojure.core/-main
  )

