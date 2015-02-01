(ns timon.core.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [timon.core.routes.timon-routes :refer [timon-routes]]
            [timon.core.models.query-defs :as query]))

(defn init
  []
  (query/create-scripts-table-if-not-exists!))

(comment
  I will need to change how init works, but for now I don't want to deal with it.
  I'm not sure how I'll do the DB design.)

(defroutes app-routes
  (route/not-found "Not Found"))

(def app
  (-> (routes timon-routes app-routes)
      (wrap-defaults (assoc-in site-defaults [:security :anti-forgery] false))))
