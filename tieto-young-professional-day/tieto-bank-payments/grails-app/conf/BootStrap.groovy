import grails.util.Environment

class BootStrap {

	def init = { servletContext ->

		Environment current = Environment.getCurrent()
		if(Environment.DEVELOPMENT.equals(current))
			new DevData().insert()
	}
	def destroy = {
	}
}
