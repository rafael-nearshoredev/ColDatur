(ns datur.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [datur.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[datur started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[datur has shut down successfully]=-"))
   :middleware wrap-dev})
