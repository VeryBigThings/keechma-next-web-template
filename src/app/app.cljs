(ns app.app
  (:require [keechma.next.controllers.router]
            [keechma.next.controllers.dataloader]
            [keechma.next.controllers.subscription]
            ["react-dom" :as rdom]))
(def app
  {:keechma.subscriptions/batcher rdom/unstable_batchedUpdates,
   :keechma/controllers
   {:router {:keechma.controller/params true,
             :keechma.controller/type :keechma/router,
             :keechma/routes [["" {:page "home"}] ":page" ":page/:subpage"]},
    :dataloader {:keechma.controller/params true,
                 :keechma.controller/type :keechma/dataloader}}})