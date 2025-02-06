package org.foo

def checkOutFrom(repo){
    git url:"git@github.com:kodyli/${repo}"
}

return this;