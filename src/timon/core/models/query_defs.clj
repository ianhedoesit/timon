(ns timon.core.models.query-defs
  (:require [environ.core :refer [env]]
            [yesql.core :refer [defqueries]]))

(defqueries "timon/core/models/timon_queries.sql"
  {:connection (env :database-url)})

(comment
  I'm probably going to want multiple sets of commands. I don't know.)
