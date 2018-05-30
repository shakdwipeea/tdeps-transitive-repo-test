(def project 'clj-playground)
(def version "0.1.0")

(set-env! :resource-paths #{"src"}
          :repositories #(conj % ["jitpack" "https://jitpack.io"])
          :dependencies '[[com.github.shakdwipeea/smtp "0.3.1"]])
