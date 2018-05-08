package bean.test

import bean.test.beans.DummyDependency

class BeanController {

    DummyDependency dummyDependency

    def index() {
        assert dummyDependency
    }
}
