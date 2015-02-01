(ns timon.core.routes.timon-routes
  (:require [ring.util.response :as response]
            [compojure.core :refer :all]
            [timon.core.views.timon-layout :refer
             [common-layout]]
            [timon.core.models.query-defs :as query]))

(defn get-route
  [request]
  "some bologna")

(defroutes timon-routes
  (GET "/" [] get-route))
