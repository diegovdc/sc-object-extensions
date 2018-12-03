+ Object {
	pipe {|...fns|
		^fns.inject({|x| x}, {|acc, el| el<>acc }).(this)
	}

	postm {|msg|
		(msg++'' + this.asString).postln; //es necesario agregar el ++'' por alguna razón
		^this
	}

	postfn {|fn|
		fn.(this).postln
	}

	postmfn {|msg, fn|
		(msg++'' + fn.(this).asString).postln
	}
}