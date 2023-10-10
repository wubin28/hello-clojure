# hello-clojure

* I'm learning clojure. can you tell me how I can run a hello world clojure app on macOS? I'd like to use leiningen to generate a scaffold project and open it using intellij idea. Please tell me how to run the app.

Certainly! Here's a step-by-step breakdown of how you can create and run a "Hello World" Clojure application on macOS using Leiningen and IntelliJ IDEA:

1. **Install Leiningen:**
    - First, you need to have Leiningen installed on your machine. If you haven't installed it yet, download the script from the [official website](https://leiningen.org/), or install it via Homebrew with the following command:
      ```bash
      brew install leiningen
      ```

2. **Create a New Project:**
    - Once Leiningen is installed, you can create a new Clojure project with the following command:
      ```bash
      lein new hello-clojure
      ```
    - This will create a new directory called `hello-clojure` with the basic project structure generated by Leiningen.

3. **Install IntelliJ IDEA:**
    - If you haven't already, download and install IntelliJ IDEA from the [official website](https://www.jetbrains.com/idea/).

4. **Install Cursive:**
    - Cursive is a Clojure plugin for IntelliJ IDEA. Install Cursive by going to `Preferences -> Plugins`, then search for `Cursive` and install it.

5. **Open Project:**

   ```
   cd katas
   idea hello-clojure
   ```

6. **Edit Source Code:**
    - Navigate to `src/hello_world/core.clj` in your project directory. This is the main file generated by Leiningen where you'll write your code.
    - Replace the content with the following Clojure code:
      ```clojure
         (ns hello-clojure.core)
 
         (defn foo
         "I don't do a whole lot."
         [x]
         (println x "Hello, World!"))
 
         (defn -main [& args]
         (foo "Clojure"))
 
         (-main)
      ```

- update file project.clj

  ```clojure
      (defproject hello-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
              :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :repl-options {:init-ns hello-clojure.core}
  :main hello-clojure.core/-main
  )
  ```

7. **Run the Application:**
    - To run the application, highlight the `core.clj` file in the project panel, press Ctrl+Shift+R, and you should see `Hello, World!` printed in the output console.
    - Or run command `lein run` in the terminal under the project directory.
    - Or run command `lein repl` in the terminal under the project directory, then type `(-main)` in the repl console.
    - Press Ctrl+D to exit the repl console.

