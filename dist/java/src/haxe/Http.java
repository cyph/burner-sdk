package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Http extends haxe.lang.HxObject
{
	static
	{
		//line 74 "/usr/share/haxe/std/haxe/Http.hx"
		haxe.Http.PROXY = null;
	}
	
	public Http(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Http(java.lang.String url)
	{
		//line 88 "/usr/share/haxe/std/haxe/Http.hx"
		haxe.Http.__hx_ctor_haxe_Http(this, url);
	}
	
	
	public static void __hx_ctor_haxe_Http(haxe.Http __temp_me13, java.lang.String url)
	{
		//line 760 "/usr/share/haxe/std/haxe/Http.hx"
		__temp_me13.onStatus = ( (( haxe.Http___hx_ctor_haxe_Http_760__Fun.__hx_current != null )) ? (haxe.Http___hx_ctor_haxe_Http_760__Fun.__hx_current) : (haxe.Http___hx_ctor_haxe_Http_760__Fun.__hx_current = ((haxe.Http___hx_ctor_haxe_Http_760__Fun) (new haxe.Http___hx_ctor_haxe_Http_760__Fun()) )) );
		//line 750 "/usr/share/haxe/std/haxe/Http.hx"
		__temp_me13.onError = ( (( haxe.Http___hx_ctor_haxe_Http_750__Fun.__hx_current != null )) ? (haxe.Http___hx_ctor_haxe_Http_750__Fun.__hx_current) : (haxe.Http___hx_ctor_haxe_Http_750__Fun.__hx_current = ((haxe.Http___hx_ctor_haxe_Http_750__Fun) (new haxe.Http___hx_ctor_haxe_Http_750__Fun()) )) );
		//line 740 "/usr/share/haxe/std/haxe/Http.hx"
		__temp_me13.onData = ( (( haxe.Http___hx_ctor_haxe_Http_740__Fun.__hx_current != null )) ? (haxe.Http___hx_ctor_haxe_Http_740__Fun.__hx_current) : (haxe.Http___hx_ctor_haxe_Http_740__Fun.__hx_current = ((haxe.Http___hx_ctor_haxe_Http_740__Fun) (new haxe.Http___hx_ctor_haxe_Http_740__Fun()) )) );
		//line 89 "/usr/share/haxe/std/haxe/Http.hx"
		__temp_me13.url = url;
		//line 90 "/usr/share/haxe/std/haxe/Http.hx"
		__temp_me13.headers = new haxe.root.List<java.lang.Object>();
		//line 91 "/usr/share/haxe/std/haxe/Http.hx"
		__temp_me13.params = new haxe.root.List<java.lang.Object>();
		//line 96 "/usr/share/haxe/std/haxe/Http.hx"
		__temp_me13.cnxTimeout = ((double) (10) );
	}
	
	
	public static java.lang.Object PROXY;
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		return new haxe.Http(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		return new haxe.Http(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
	public java.lang.String url;
	
	public java.lang.String responseData;
	
	public boolean noShutdown;
	
	public double cnxTimeout;
	
	public haxe.ds.StringMap<java.lang.String> responseHeaders;
	
	public java.lang.Object chunk_size;
	
	public haxe.io.Bytes chunk_buf;
	
	public java.lang.Object file;
	
	public java.lang.String postData;
	
	public haxe.root.List<java.lang.Object> headers;
	
	public haxe.root.List<java.lang.Object> params;
	
	public haxe.Http setHeader(java.lang.String header, java.lang.String value)
	{
		//line 111 "/usr/share/haxe/std/haxe/Http.hx"
		this.headers = ((haxe.root.List<java.lang.Object>) (haxe.root.Lambda.filter(this.headers, new haxe.Http_setHeader_111__Fun(header))) );
		//line 112 "/usr/share/haxe/std/haxe/Http.hx"
		this.headers.push(new haxe.lang.DynamicObject(new java.lang.String[]{"header", "value"}, new java.lang.Object[]{header, value}, new java.lang.String[]{}, new double[]{}));
		//line 113 "/usr/share/haxe/std/haxe/Http.hx"
		return this;
	}
	
	
	public haxe.Http setParameter(java.lang.String param, java.lang.String value)
	{
		//line 129 "/usr/share/haxe/std/haxe/Http.hx"
		this.params = ((haxe.root.List<java.lang.Object>) (haxe.root.Lambda.filter(this.params, new haxe.Http_setParameter_129__Fun(param))) );
		//line 130 "/usr/share/haxe/std/haxe/Http.hx"
		this.params.push(new haxe.lang.DynamicObject(new java.lang.String[]{"param", "value"}, new java.lang.Object[]{param, value}, new java.lang.String[]{}, new double[]{}));
		//line 131 "/usr/share/haxe/std/haxe/Http.hx"
		return this;
	}
	
	
	public haxe.Http setPostData(java.lang.String data)
	{
		//line 150 "/usr/share/haxe/std/haxe/Http.hx"
		this.postData = data;
		//line 151 "/usr/share/haxe/std/haxe/Http.hx"
		return this;
	}
	
	
	public void request(java.lang.Object post)
	{
		//line 195 "/usr/share/haxe/std/haxe/Http.hx"
		haxe.Http _g = this;
		//line 196 "/usr/share/haxe/std/haxe/Http.hx"
		haxe.Http me = this;
		//line 332 "/usr/share/haxe/std/haxe/Http.hx"
		haxe.Http me1 = this;
		//line 333 "/usr/share/haxe/std/haxe/Http.hx"
		haxe.io.BytesOutput output = new haxe.io.BytesOutput();
		//line 334 "/usr/share/haxe/std/haxe/Http.hx"
		haxe.lang.Function old = this.onError;
		//line 335 "/usr/share/haxe/std/haxe/Http.hx"
		boolean[] err = new boolean[]{false};
		//line 336 "/usr/share/haxe/std/haxe/Http.hx"
		this.onError = new haxe.Http_request_336__Fun(output, old, me1, err, _g);
		//line 347 "/usr/share/haxe/std/haxe/Http.hx"
		this.customRequest(haxe.lang.Runtime.toBool(post), output, null, null);
		//line 348 "/usr/share/haxe/std/haxe/Http.hx"
		if ( ! (err[0]) ) 
		{
			//line 352 "/usr/share/haxe/std/haxe/Http.hx"
			me1.onData.__hx_invoke1_o(0.0, me1.responseData = output.getBytes().toString());
		}
		
	}
	
	
	public void customRequest(boolean post, haxe.io.Output api, java.lang.Object sock, java.lang.String method)
	{
		//line 372 "/usr/share/haxe/std/haxe/Http.hx"
		this.responseData = null;
		//line 373 "/usr/share/haxe/std/haxe/Http.hx"
		haxe.root.EReg url_regexp = new haxe.root.EReg("^(https?://)?([a-zA-Z\\.0-9_-]+)(:[0-9]+)?(.*)$", "");
		//line 374 "/usr/share/haxe/std/haxe/Http.hx"
		if ( ! (url_regexp.match(this.url)) ) 
		{
			//line 375 "/usr/share/haxe/std/haxe/Http.hx"
			this.onError.__hx_invoke1_o(0.0, "Invalid URL");
			//line 376 "/usr/share/haxe/std/haxe/Http.hx"
			return ;
		}
		
		//line 378 "/usr/share/haxe/std/haxe/Http.hx"
		boolean secure = haxe.lang.Runtime.valEq(url_regexp.matched(1), "https://");
		//line 379 "/usr/share/haxe/std/haxe/Http.hx"
		if (( sock == null )) 
		{
			//line 380 "/usr/share/haxe/std/haxe/Http.hx"
			if (secure) 
			{
				//line 384 "/usr/share/haxe/std/haxe/Http.hx"
				sock = new haxe.java.net.SslSocket();
			}
			else
			{
				//line 395 "/usr/share/haxe/std/haxe/Http.hx"
				sock = new sys.net.Socket();
			}
			
		}
		
		//line 397 "/usr/share/haxe/std/haxe/Http.hx"
		java.lang.String host = url_regexp.matched(2);
		//line 398 "/usr/share/haxe/std/haxe/Http.hx"
		java.lang.String portString = url_regexp.matched(3);
		//line 399 "/usr/share/haxe/std/haxe/Http.hx"
		java.lang.String request = url_regexp.matched(4);
		//line 400 "/usr/share/haxe/std/haxe/Http.hx"
		if (haxe.lang.Runtime.valEq(request, "")) 
		{
			//line 401 "/usr/share/haxe/std/haxe/Http.hx"
			request = "/";
		}
		
		//line 402 "/usr/share/haxe/std/haxe/Http.hx"
		java.lang.Object port = null;
		//line 402 "/usr/share/haxe/std/haxe/Http.hx"
		if (( ( portString == null ) || haxe.lang.Runtime.valEq(portString, "") )) 
		{
			//line 402 "/usr/share/haxe/std/haxe/Http.hx"
			if (secure) 
			{
				//line 402 "/usr/share/haxe/std/haxe/Http.hx"
				port = 443;
			}
			else
			{
				//line 402 "/usr/share/haxe/std/haxe/Http.hx"
				port = 80;
			}
			
		}
		else
		{
			//line 402 "/usr/share/haxe/std/haxe/Http.hx"
			port = haxe.root.Std.parseInt(haxe.lang.StringExt.substr(portString, 1, ( portString.length() - 1 )));
		}
		
		//line 403 "/usr/share/haxe/std/haxe/Http.hx"
		java.lang.Object data = null;
		//line 405 "/usr/share/haxe/std/haxe/Http.hx"
		boolean multipart = ( ! (( this.file == null )) );
		//line 406 "/usr/share/haxe/std/haxe/Http.hx"
		java.lang.String boundary = null;
		//line 407 "/usr/share/haxe/std/haxe/Http.hx"
		java.lang.String uri = null;
		//line 408 "/usr/share/haxe/std/haxe/Http.hx"
		if (multipart) 
		{
			//line 409 "/usr/share/haxe/std/haxe/Http.hx"
			post = true;
			//line 410 "/usr/share/haxe/std/haxe/Http.hx"
			boundary = ( ( ( haxe.root.Std.string(haxe.root.Std.random(1000)) + haxe.root.Std.string(haxe.root.Std.random(1000)) ) + haxe.root.Std.string(haxe.root.Std.random(1000)) ) + haxe.root.Std.string(haxe.root.Std.random(1000)) );
			//line 411 "/usr/share/haxe/std/haxe/Http.hx"
			while (( boundary.length() < 38 ))
			{
				//line 412 "/usr/share/haxe/std/haxe/Http.hx"
				boundary = ( "-" + boundary );
			}
			
			//line 413 "/usr/share/haxe/std/haxe/Http.hx"
			haxe.root.StringBuf b = new haxe.root.StringBuf();
			//line 414 "/usr/share/haxe/std/haxe/Http.hx"
			{
				//line 414 "/usr/share/haxe/std/haxe/Http.hx"
				haxe.root.Array _g_head = this.params.h;
				//line 414 "/usr/share/haxe/std/haxe/Http.hx"
				java.lang.Object _g_val = null;
				//line 414 "/usr/share/haxe/std/haxe/Http.hx"
				while (( _g_head != null ))
				{
					//line 414 "/usr/share/haxe/std/haxe/Http.hx"
					java.lang.Object p = null;
					//line 414 "/usr/share/haxe/std/haxe/Http.hx"
					java.lang.Object __temp_stmt8 = null;
					//line 414 "/usr/share/haxe/std/haxe/Http.hx"
					{
						//line 414 "/usr/share/haxe/std/haxe/Http.hx"
						_g_val = _g_head.__get(0);
						//line 414 "/usr/share/haxe/std/haxe/Http.hx"
						_g_head = ((haxe.root.Array) (_g_head.__get(1)) );
						//line 371 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_stmt8 = _g_val;
					}
					
					//line 414 "/usr/share/haxe/std/haxe/Http.hx"
					p = ((java.lang.Object) (__temp_stmt8) );
					//line 415 "/usr/share/haxe/std/haxe/Http.hx"
					b.add("--");
					//line 416 "/usr/share/haxe/std/haxe/Http.hx"
					b.add(boundary);
					//line 417 "/usr/share/haxe/std/haxe/Http.hx"
					b.add("\r\n");
					//line 418 "/usr/share/haxe/std/haxe/Http.hx"
					b.add("Content-Disposition: form-data; name=\"");
					//line 419 "/usr/share/haxe/std/haxe/Http.hx"
					b.add(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(p, "param", true)));
					//line 420 "/usr/share/haxe/std/haxe/Http.hx"
					b.add("\"");
					//line 421 "/usr/share/haxe/std/haxe/Http.hx"
					b.add("\r\n");
					//line 422 "/usr/share/haxe/std/haxe/Http.hx"
					b.add("\r\n");
					//line 423 "/usr/share/haxe/std/haxe/Http.hx"
					b.add(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(p, "value", true)));
					//line 424 "/usr/share/haxe/std/haxe/Http.hx"
					b.add("\r\n");
				}
				
			}
			
			//line 426 "/usr/share/haxe/std/haxe/Http.hx"
			b.add("--");
			//line 427 "/usr/share/haxe/std/haxe/Http.hx"
			b.add(boundary);
			//line 428 "/usr/share/haxe/std/haxe/Http.hx"
			b.add("\r\n");
			//line 429 "/usr/share/haxe/std/haxe/Http.hx"
			b.add("Content-Disposition: form-data; name=\"");
			//line 430 "/usr/share/haxe/std/haxe/Http.hx"
			b.add(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(this.file, "param", true)));
			//line 431 "/usr/share/haxe/std/haxe/Http.hx"
			b.add("\"; filename=\"");
			//line 432 "/usr/share/haxe/std/haxe/Http.hx"
			b.add(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(this.file, "filename", true)));
			//line 433 "/usr/share/haxe/std/haxe/Http.hx"
			b.add("\"");
			//line 434 "/usr/share/haxe/std/haxe/Http.hx"
			b.add("\r\n");
			//line 435 "/usr/share/haxe/std/haxe/Http.hx"
			b.add(( ( ( "Content-Type: " + haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(this.file, "mimeType", true)) ) + "\r\n" ) + "\r\n" ));
			//line 436 "/usr/share/haxe/std/haxe/Http.hx"
			uri = b.toString();
		}
		else
		{
			//line 438 "/usr/share/haxe/std/haxe/Http.hx"
			haxe.root.Array _g_head1 = this.params.h;
			//line 438 "/usr/share/haxe/std/haxe/Http.hx"
			java.lang.Object _g_val1 = null;
			//line 438 "/usr/share/haxe/std/haxe/Http.hx"
			while (( _g_head1 != null ))
			{
				//line 438 "/usr/share/haxe/std/haxe/Http.hx"
				java.lang.Object p1 = null;
				//line 438 "/usr/share/haxe/std/haxe/Http.hx"
				java.lang.Object __temp_stmt7 = null;
				//line 438 "/usr/share/haxe/std/haxe/Http.hx"
				{
					//line 438 "/usr/share/haxe/std/haxe/Http.hx"
					_g_val1 = _g_head1.__get(0);
					//line 438 "/usr/share/haxe/std/haxe/Http.hx"
					_g_head1 = ((haxe.root.Array) (_g_head1.__get(1)) );
					//line 371 "/usr/share/haxe/std/haxe/Http.hx"
					__temp_stmt7 = _g_val1;
				}
				
				//line 438 "/usr/share/haxe/std/haxe/Http.hx"
				p1 = ((java.lang.Object) (__temp_stmt7) );
				//line 439 "/usr/share/haxe/std/haxe/Http.hx"
				if (( uri == null )) 
				{
					//line 440 "/usr/share/haxe/std/haxe/Http.hx"
					uri = "";
				}
				else
				{
					//line 442 "/usr/share/haxe/std/haxe/Http.hx"
					uri += "&";
				}
				
				//line 443 "/usr/share/haxe/std/haxe/Http.hx"
				uri += ( ( haxe.root.StringTools.urlEncode(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(p1, "param", true))) + "=" ) + haxe.root.StringTools.urlEncode(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(p1, "value", true))) );
			}
			
		}
		
		//line 447 "/usr/share/haxe/std/haxe/Http.hx"
		haxe.root.StringBuf b1 = new haxe.root.StringBuf();
		//line 448 "/usr/share/haxe/std/haxe/Http.hx"
		if (( method != null )) 
		{
			//line 449 "/usr/share/haxe/std/haxe/Http.hx"
			b1.add(method);
			//line 450 "/usr/share/haxe/std/haxe/Http.hx"
			b1.add(" ");
		}
		else
		{
			//line 451 "/usr/share/haxe/std/haxe/Http.hx"
			if (post) 
			{
				//line 452 "/usr/share/haxe/std/haxe/Http.hx"
				b1.add("POST ");
			}
			else
			{
				//line 454 "/usr/share/haxe/std/haxe/Http.hx"
				b1.add("GET ");
			}
			
		}
		
		//line 456 "/usr/share/haxe/std/haxe/Http.hx"
		if (( ! (( haxe.Http.PROXY == null )) )) 
		{
			//line 457 "/usr/share/haxe/std/haxe/Http.hx"
			b1.add("http://");
			//line 458 "/usr/share/haxe/std/haxe/Http.hx"
			b1.add(host);
			//line 459 "/usr/share/haxe/std/haxe/Http.hx"
			if (( ! (haxe.lang.Runtime.eq(port, 80)) )) 
			{
				//line 460 "/usr/share/haxe/std/haxe/Http.hx"
				b1.add(":");
				//line 461 "/usr/share/haxe/std/haxe/Http.hx"
				b1.add(port);
			}
			
		}
		
		//line 464 "/usr/share/haxe/std/haxe/Http.hx"
		b1.add(request);
		//line 466 "/usr/share/haxe/std/haxe/Http.hx"
		if ((  ! (post)  && ( uri != null ) )) 
		{
			//line 467 "/usr/share/haxe/std/haxe/Http.hx"
			if (( haxe.lang.StringExt.indexOf(request, "?", 0) >= 0 )) 
			{
				//line 468 "/usr/share/haxe/std/haxe/Http.hx"
				b1.add("&");
			}
			else
			{
				//line 470 "/usr/share/haxe/std/haxe/Http.hx"
				b1.add("?");
			}
			
			//line 471 "/usr/share/haxe/std/haxe/Http.hx"
			b1.add(uri);
		}
		
		//line 473 "/usr/share/haxe/std/haxe/Http.hx"
		b1.add(( ( " HTTP/1.1\r\nHost: " + host ) + "\r\n" ));
		//line 474 "/usr/share/haxe/std/haxe/Http.hx"
		if (( this.postData != null )) 
		{
			//line 475 "/usr/share/haxe/std/haxe/Http.hx"
			b1.add(( ( "Content-Length: " + this.postData.length() ) + "\r\n" ));
		}
		else
		{
			//line 476 "/usr/share/haxe/std/haxe/Http.hx"
			if (( post && ( uri != null ) )) 
			{
				//line 477 "/usr/share/haxe/std/haxe/Http.hx"
				if (( multipart ||  ! (haxe.lang.Runtime.toBool(haxe.root.Lambda.exists(this.headers, ( (( haxe.Http_customRequest_477__Fun.__hx_current != null )) ? (haxe.Http_customRequest_477__Fun.__hx_current) : (haxe.Http_customRequest_477__Fun.__hx_current = ((haxe.Http_customRequest_477__Fun) (new haxe.Http_customRequest_477__Fun()) )) ))))  )) 
				{
					//line 478 "/usr/share/haxe/std/haxe/Http.hx"
					b1.add("Content-Type: ");
					//line 479 "/usr/share/haxe/std/haxe/Http.hx"
					if (multipart) 
					{
						//line 480 "/usr/share/haxe/std/haxe/Http.hx"
						b1.add("multipart/form-data");
						//line 481 "/usr/share/haxe/std/haxe/Http.hx"
						b1.add("; boundary=");
						//line 482 "/usr/share/haxe/std/haxe/Http.hx"
						b1.add(boundary);
					}
					else
					{
						//line 484 "/usr/share/haxe/std/haxe/Http.hx"
						b1.add("application/x-www-form-urlencoded");
					}
					
					//line 485 "/usr/share/haxe/std/haxe/Http.hx"
					b1.add("\r\n");
				}
				
				//line 487 "/usr/share/haxe/std/haxe/Http.hx"
				if (multipart) 
				{
					//line 488 "/usr/share/haxe/std/haxe/Http.hx"
					b1.add(( ( "Content-Length: " + (( ( ( uri.length() + ((int) (haxe.lang.Runtime.getField_f(this.file, "size", true)) ) ) + boundary.length() ) + 6 )) ) + "\r\n" ));
				}
				else
				{
					//line 490 "/usr/share/haxe/std/haxe/Http.hx"
					b1.add(( ( "Content-Length: " + uri.length() ) + "\r\n" ));
				}
				
			}
			
		}
		
		//line 492 "/usr/share/haxe/std/haxe/Http.hx"
		{
			//line 492 "/usr/share/haxe/std/haxe/Http.hx"
			haxe.root.Array _g_head2 = this.headers.h;
			//line 492 "/usr/share/haxe/std/haxe/Http.hx"
			java.lang.Object _g_val2 = null;
			//line 492 "/usr/share/haxe/std/haxe/Http.hx"
			while (( _g_head2 != null ))
			{
				//line 492 "/usr/share/haxe/std/haxe/Http.hx"
				java.lang.Object h1 = null;
				//line 492 "/usr/share/haxe/std/haxe/Http.hx"
				java.lang.Object __temp_stmt9 = null;
				//line 492 "/usr/share/haxe/std/haxe/Http.hx"
				{
					//line 492 "/usr/share/haxe/std/haxe/Http.hx"
					_g_val2 = _g_head2.__get(0);
					//line 492 "/usr/share/haxe/std/haxe/Http.hx"
					_g_head2 = ((haxe.root.Array) (_g_head2.__get(1)) );
					//line 371 "/usr/share/haxe/std/haxe/Http.hx"
					__temp_stmt9 = _g_val2;
				}
				
				//line 492 "/usr/share/haxe/std/haxe/Http.hx"
				h1 = ((java.lang.Object) (__temp_stmt9) );
				//line 493 "/usr/share/haxe/std/haxe/Http.hx"
				b1.add(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(h1, "header", true)));
				//line 494 "/usr/share/haxe/std/haxe/Http.hx"
				b1.add(": ");
				//line 495 "/usr/share/haxe/std/haxe/Http.hx"
				b1.add(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(h1, "value", true)));
				//line 496 "/usr/share/haxe/std/haxe/Http.hx"
				b1.add("\r\n");
			}
			
		}
		
		//line 498 "/usr/share/haxe/std/haxe/Http.hx"
		b1.add("\r\n");
		//line 499 "/usr/share/haxe/std/haxe/Http.hx"
		if (( this.postData != null )) 
		{
			//line 500 "/usr/share/haxe/std/haxe/Http.hx"
			b1.add(this.postData);
		}
		else
		{
			//line 501 "/usr/share/haxe/std/haxe/Http.hx"
			if (( post && ( uri != null ) )) 
			{
				//line 502 "/usr/share/haxe/std/haxe/Http.hx"
				b1.add(uri);
			}
			
		}
		
		//line 503 "/usr/share/haxe/std/haxe/Http.hx"
		try 
		{
			//line 504 "/usr/share/haxe/std/haxe/Http.hx"
			if (( ! (( haxe.Http.PROXY == null )) )) 
			{
				//line 505 "/usr/share/haxe/std/haxe/Http.hx"
				haxe.lang.Runtime.callField(sock, "connect", new haxe.root.Array(new java.lang.Object[]{new sys.net.Host(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(haxe.Http.PROXY, "host", true))), ((int) (haxe.lang.Runtime.getField_f(haxe.Http.PROXY, "port", true)) )}));
			}
			else
			{
				//line 507 "/usr/share/haxe/std/haxe/Http.hx"
				haxe.lang.Runtime.callField(sock, "connect", new haxe.root.Array(new java.lang.Object[]{new sys.net.Host(haxe.lang.Runtime.toString(host)), port}));
			}
			
			//line 508 "/usr/share/haxe/std/haxe/Http.hx"
			haxe.lang.Runtime.callField(sock, "write", new haxe.root.Array(new java.lang.Object[]{b1.toString()}));
			//line 509 "/usr/share/haxe/std/haxe/Http.hx"
			if (multipart) 
			{
				//line 510 "/usr/share/haxe/std/haxe/Http.hx"
				int bufsize = 4096;
				//line 511 "/usr/share/haxe/std/haxe/Http.hx"
				haxe.io.Bytes buf = haxe.io.Bytes.alloc(bufsize);
				//line 512 "/usr/share/haxe/std/haxe/Http.hx"
				while (( haxe.lang.Runtime.compare(((int) (haxe.lang.Runtime.getField_f(this.file, "size", true)) ), 0) > 0 ))
				{
					//line 513 "/usr/share/haxe/std/haxe/Http.hx"
					int size = 0;
					//line 513 "/usr/share/haxe/std/haxe/Http.hx"
					if (( haxe.lang.Runtime.compare(((int) (haxe.lang.Runtime.getField_f(this.file, "size", true)) ), bufsize) > 0 )) 
					{
						//line 513 "/usr/share/haxe/std/haxe/Http.hx"
						size = bufsize;
					}
					else
					{
						//line 513 "/usr/share/haxe/std/haxe/Http.hx"
						size = ((int) (haxe.lang.Runtime.getField_f(this.file, "size", true)) );
					}
					
					//line 514 "/usr/share/haxe/std/haxe/Http.hx"
					int len = 0;
					//line 516 "/usr/share/haxe/std/haxe/Http.hx"
					try 
					{
						//line 516 "/usr/share/haxe/std/haxe/Http.hx"
						len = ((haxe.io.Input) (haxe.lang.Runtime.getField(this.file, "io", true)) ).readBytes(buf, 0, size);
					}
					catch (java.lang.Throwable __temp_catchallException5)
					{
						//line 516 "/usr/share/haxe/std/haxe/Http.hx"
						haxe.lang.Exceptions.setException(__temp_catchallException5);
						//line 517 "/usr/share/haxe/std/haxe/Http.hx"
						java.lang.Object __temp_catchall6 = __temp_catchallException5;
						//line 517 "/usr/share/haxe/std/haxe/Http.hx"
						if (( __temp_catchall6 instanceof haxe.lang.HaxeException )) 
						{
							//line 517 "/usr/share/haxe/std/haxe/Http.hx"
							__temp_catchall6 = ((haxe.lang.HaxeException) (__temp_catchallException5) ).obj;
						}
						
						//line 517 "/usr/share/haxe/std/haxe/Http.hx"
						if (( __temp_catchall6 instanceof haxe.io.Eof )) 
						{
							//line 517 "/usr/share/haxe/std/haxe/Http.hx"
							haxe.io.Eof e = ((haxe.io.Eof) (__temp_catchall6) );
							//line 517 "/usr/share/haxe/std/haxe/Http.hx"
							{
								//line 517 "/usr/share/haxe/std/haxe/Http.hx"
								break;
							}
							
						}
						else
						{
							//line 517 "/usr/share/haxe/std/haxe/Http.hx"
							throw haxe.lang.HaxeException.wrap(__temp_catchallException5);
						}
						
					}
					
					
					//line 518 "/usr/share/haxe/std/haxe/Http.hx"
					((haxe.io.Output) (haxe.lang.Runtime.getField(sock, "output", true)) ).writeFullBytes(buf, 0, len);
					//line 519 "/usr/share/haxe/std/haxe/Http.hx"
					{
						//line 519 "/usr/share/haxe/std/haxe/Http.hx"
						java.lang.Object __temp_dynop1 = this.file;
						//line 519 "/usr/share/haxe/std/haxe/Http.hx"
						haxe.lang.Runtime.setField_f(__temp_dynop1, "size", ((double) (( ((int) (haxe.lang.Runtime.getField_f(__temp_dynop1, "size", true)) ) - ((int) (len) ) )) ));
					}
					
				}
				
				//line 521 "/usr/share/haxe/std/haxe/Http.hx"
				haxe.lang.Runtime.callField(sock, "write", new haxe.root.Array(new java.lang.Object[]{"\r\n"}));
				//line 522 "/usr/share/haxe/std/haxe/Http.hx"
				haxe.lang.Runtime.callField(sock, "write", new haxe.root.Array(new java.lang.Object[]{"--"}));
				//line 523 "/usr/share/haxe/std/haxe/Http.hx"
				haxe.lang.Runtime.callField(sock, "write", new haxe.root.Array(new java.lang.Object[]{boundary}));
				//line 524 "/usr/share/haxe/std/haxe/Http.hx"
				haxe.lang.Runtime.callField(sock, "write", new haxe.root.Array(new java.lang.Object[]{"--"}));
			}
			
			//line 526 "/usr/share/haxe/std/haxe/Http.hx"
			this.readHttpResponse(api, sock);
			//line 527 "/usr/share/haxe/std/haxe/Http.hx"
			haxe.lang.Runtime.callField(sock, "close", null);
		}
		catch (java.lang.Throwable __temp_catchallException3)
		{
			//line 503 "/usr/share/haxe/std/haxe/Http.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException3);
			//line 528 "/usr/share/haxe/std/haxe/Http.hx"
			java.lang.Object __temp_catchall4 = __temp_catchallException3;
			//line 528 "/usr/share/haxe/std/haxe/Http.hx"
			if (( __temp_catchall4 instanceof haxe.lang.HaxeException )) 
			{
				//line 528 "/usr/share/haxe/std/haxe/Http.hx"
				__temp_catchall4 = ((haxe.lang.HaxeException) (__temp_catchallException3) ).obj;
			}
			
			//line 528 "/usr/share/haxe/std/haxe/Http.hx"
			{
				//line 528 "/usr/share/haxe/std/haxe/Http.hx"
				java.lang.Object e1 = __temp_catchall4;
				//line 529 "/usr/share/haxe/std/haxe/Http.hx"
				try 
				{
					//line 529 "/usr/share/haxe/std/haxe/Http.hx"
					haxe.lang.Runtime.callField(sock, "close", null);
				}
				catch (java.lang.Throwable __temp_catchallException1)
				{
					//line 529 "/usr/share/haxe/std/haxe/Http.hx"
					haxe.lang.Exceptions.setException(__temp_catchallException1);
					//line 529 "/usr/share/haxe/std/haxe/Http.hx"
					java.lang.Object __temp_catchall2 = __temp_catchallException1;
					//line 529 "/usr/share/haxe/std/haxe/Http.hx"
					if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
					{
						//line 529 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
					}
					
					//line 529 "/usr/share/haxe/std/haxe/Http.hx"
					{
						//line 529 "/usr/share/haxe/std/haxe/Http.hx"
						java.lang.Object e2 = __temp_catchall2;
					}
					
				}
				
				
				//line 530 "/usr/share/haxe/std/haxe/Http.hx"
				this.onError.__hx_invoke1_o(0.0, haxe.root.Std.string(e1));
			}
			
		}
		
		
	}
	
	
	public void readHttpResponse(haxe.io.Output api, java.lang.Object sock)
	{
		//line 534 "/usr/share/haxe/std/haxe/Http.hx"
		try 
		{
			//line 536 "/usr/share/haxe/std/haxe/Http.hx"
			haxe.io.BytesBuffer b = new haxe.io.BytesBuffer();
			//line 537 "/usr/share/haxe/std/haxe/Http.hx"
			int k = 4;
			//line 538 "/usr/share/haxe/std/haxe/Http.hx"
			haxe.io.Bytes s = haxe.io.Bytes.alloc(4);
			//line 539 "/usr/share/haxe/std/haxe/Http.hx"
			haxe.lang.Runtime.callField(sock, "setTimeout", new haxe.root.Array(new java.lang.Object[]{this.cnxTimeout}));
			//line 540 "/usr/share/haxe/std/haxe/Http.hx"
			{
				//line 540 "/usr/share/haxe/std/haxe/Http.hx"
				label1:
				//line 540 "/usr/share/haxe/std/haxe/Http.hx"
				while (true)
				{
					//line 541 "/usr/share/haxe/std/haxe/Http.hx"
					int p = ((haxe.io.Input) (haxe.lang.Runtime.getField(sock, "input", true)) ).readBytes(s, 0, k);
					//line 542 "/usr/share/haxe/std/haxe/Http.hx"
					while (( p != k ))
					{
						//line 543 "/usr/share/haxe/std/haxe/Http.hx"
						p += ((haxe.io.Input) (haxe.lang.Runtime.getField(sock, "input", true)) ).readBytes(s, p, ( k - p ));
					}
					
					//line 544 "/usr/share/haxe/std/haxe/Http.hx"
					{
						//line 544 "/usr/share/haxe/std/haxe/Http.hx"
						if (( ( k < 0 ) || ( k > s.length ) )) 
						{
							//line 544 "/usr/share/haxe/std/haxe/Http.hx"
							throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
						}
						
						//line 544 "/usr/share/haxe/std/haxe/Http.hx"
						b.b.write(((byte[]) (s.b) ), ((int) (0) ), ((int) (k) ));
					}
					
					//line 545 "/usr/share/haxe/std/haxe/Http.hx"
					switch (k)
					{
						case 1:
						{
							//line 547 "/usr/share/haxe/std/haxe/Http.hx"
							int c = ( s.b[0] & 255 );
							//line 548 "/usr/share/haxe/std/haxe/Http.hx"
							if (( c == 10 )) 
							{
								//line 549 "/usr/share/haxe/std/haxe/Http.hx"
								break label1;
							}
							
							//line 550 "/usr/share/haxe/std/haxe/Http.hx"
							if (( c == 13 )) 
							{
								//line 551 "/usr/share/haxe/std/haxe/Http.hx"
								k = 3;
							}
							else
							{
								//line 553 "/usr/share/haxe/std/haxe/Http.hx"
								k = 4;
							}
							
							//line 546 "/usr/share/haxe/std/haxe/Http.hx"
							break;
						}
						
						
						case 2:
						{
							//line 555 "/usr/share/haxe/std/haxe/Http.hx"
							int c1 = ( s.b[1] & 255 );
							//line 556 "/usr/share/haxe/std/haxe/Http.hx"
							if (( c1 == 10 )) 
							{
								//line 557 "/usr/share/haxe/std/haxe/Http.hx"
								if (( (( s.b[0] & 255 )) == 13 )) 
								{
									//line 558 "/usr/share/haxe/std/haxe/Http.hx"
									break label1;
								}
								
								//line 559 "/usr/share/haxe/std/haxe/Http.hx"
								k = 4;
							}
							else
							{
								//line 560 "/usr/share/haxe/std/haxe/Http.hx"
								if (( c1 == 13 )) 
								{
									//line 561 "/usr/share/haxe/std/haxe/Http.hx"
									k = 3;
								}
								else
								{
									//line 563 "/usr/share/haxe/std/haxe/Http.hx"
									k = 4;
								}
								
							}
							
							//line 554 "/usr/share/haxe/std/haxe/Http.hx"
							break;
						}
						
						
						case 3:
						{
							//line 565 "/usr/share/haxe/std/haxe/Http.hx"
							int c2 = ( s.b[2] & 255 );
							//line 566 "/usr/share/haxe/std/haxe/Http.hx"
							if (( c2 == 10 )) 
							{
								//line 567 "/usr/share/haxe/std/haxe/Http.hx"
								if (( (( s.b[1] & 255 )) != 13 )) 
								{
									//line 568 "/usr/share/haxe/std/haxe/Http.hx"
									k = 4;
								}
								else
								{
									//line 569 "/usr/share/haxe/std/haxe/Http.hx"
									if (( (( s.b[0] & 255 )) != 10 )) 
									{
										//line 570 "/usr/share/haxe/std/haxe/Http.hx"
										k = 2;
									}
									else
									{
										//line 572 "/usr/share/haxe/std/haxe/Http.hx"
										break label1;
									}
									
								}
								
							}
							else
							{
								//line 573 "/usr/share/haxe/std/haxe/Http.hx"
								if (( c2 == 13 )) 
								{
									//line 574 "/usr/share/haxe/std/haxe/Http.hx"
									if (( ( (( s.b[1] & 255 )) != 10 ) || ( (( s.b[0] & 255 )) != 13 ) )) 
									{
										//line 575 "/usr/share/haxe/std/haxe/Http.hx"
										k = 1;
									}
									else
									{
										//line 577 "/usr/share/haxe/std/haxe/Http.hx"
										k = 3;
									}
									
								}
								else
								{
									//line 579 "/usr/share/haxe/std/haxe/Http.hx"
									k = 4;
								}
								
							}
							
							//line 564 "/usr/share/haxe/std/haxe/Http.hx"
							break;
						}
						
						
						case 4:
						{
							//line 581 "/usr/share/haxe/std/haxe/Http.hx"
							int c3 = ( s.b[3] & 255 );
							//line 582 "/usr/share/haxe/std/haxe/Http.hx"
							if (( c3 == 10 )) 
							{
								//line 583 "/usr/share/haxe/std/haxe/Http.hx"
								if (( (( s.b[2] & 255 )) != 13 )) 
								{
									//line 584 "/usr/share/haxe/std/haxe/Http.hx"
									continue;
								}
								else
								{
									//line 585 "/usr/share/haxe/std/haxe/Http.hx"
									if (( ( (( s.b[1] & 255 )) != 10 ) || ( (( s.b[0] & 255 )) != 13 ) )) 
									{
										//line 586 "/usr/share/haxe/std/haxe/Http.hx"
										k = 2;
									}
									else
									{
										//line 588 "/usr/share/haxe/std/haxe/Http.hx"
										break label1;
									}
									
								}
								
							}
							else
							{
								//line 589 "/usr/share/haxe/std/haxe/Http.hx"
								if (( c3 == 13 )) 
								{
									//line 590 "/usr/share/haxe/std/haxe/Http.hx"
									if (( ( (( s.b[2] & 255 )) != 10 ) || ( (( s.b[1] & 255 )) != 13 ) )) 
									{
										//line 591 "/usr/share/haxe/std/haxe/Http.hx"
										k = 3;
									}
									else
									{
										//line 593 "/usr/share/haxe/std/haxe/Http.hx"
										k = 1;
									}
									
								}
								
							}
							
							//line 580 "/usr/share/haxe/std/haxe/Http.hx"
							break;
						}
						
						
					}
					
				}
				
			}
			
			//line 600 "/usr/share/haxe/std/haxe/Http.hx"
			haxe.root.Array<java.lang.String> headers = haxe.lang.StringExt.split(b.getBytes().toString(), "\r\n");
			//line 602 "/usr/share/haxe/std/haxe/Http.hx"
			java.lang.String response = haxe.lang.Runtime.toString(headers.shift());
			//line 603 "/usr/share/haxe/std/haxe/Http.hx"
			haxe.root.Array<java.lang.String> rp = haxe.lang.StringExt.split(response, " ");
			//line 604 "/usr/share/haxe/std/haxe/Http.hx"
			java.lang.Object status = haxe.root.Std.parseInt(rp.__get(1));
			//line 605 "/usr/share/haxe/std/haxe/Http.hx"
			if (( haxe.lang.Runtime.eq(status, 0) || haxe.lang.Runtime.eq(status, null) )) 
			{
				//line 606 "/usr/share/haxe/std/haxe/Http.hx"
				throw haxe.lang.HaxeException.wrap("Response status error");
			}
			
			//line 609 "/usr/share/haxe/std/haxe/Http.hx"
			headers.pop();
			//line 610 "/usr/share/haxe/std/haxe/Http.hx"
			headers.pop();
			//line 611 "/usr/share/haxe/std/haxe/Http.hx"
			this.responseHeaders = ((haxe.ds.StringMap<java.lang.String>) (new haxe.ds.StringMap<java.lang.String>()) );
			//line 612 "/usr/share/haxe/std/haxe/Http.hx"
			java.lang.Object size = null;
			//line 613 "/usr/share/haxe/std/haxe/Http.hx"
			boolean chunked = false;
			//line 614 "/usr/share/haxe/std/haxe/Http.hx"
			{
				//line 614 "/usr/share/haxe/std/haxe/Http.hx"
				int _g = 0;
				//line 614 "/usr/share/haxe/std/haxe/Http.hx"
				while (( _g < headers.length ))
				{
					//line 614 "/usr/share/haxe/std/haxe/Http.hx"
					java.lang.String hline = headers.__get(_g);
					//line 614 "/usr/share/haxe/std/haxe/Http.hx"
					 ++ _g;
					//line 615 "/usr/share/haxe/std/haxe/Http.hx"
					haxe.root.Array<java.lang.String> a = haxe.lang.StringExt.split(hline, ": ");
					//line 616 "/usr/share/haxe/std/haxe/Http.hx"
					java.lang.String hname = haxe.lang.Runtime.toString(a.shift());
					//line 617 "/usr/share/haxe/std/haxe/Http.hx"
					java.lang.String hval = null;
					//line 617 "/usr/share/haxe/std/haxe/Http.hx"
					if (( a.length == 1 )) 
					{
						//line 617 "/usr/share/haxe/std/haxe/Http.hx"
						hval = a.__get(0);
					}
					else
					{
						//line 617 "/usr/share/haxe/std/haxe/Http.hx"
						hval = a.join(": ");
					}
					
					//line 618 "/usr/share/haxe/std/haxe/Http.hx"
					hval = haxe.root.StringTools.ltrim(haxe.root.StringTools.rtrim(hval));
					//line 619 "/usr/share/haxe/std/haxe/Http.hx"
					this.responseHeaders.set(hname, hval);
					//line 620 "/usr/share/haxe/std/haxe/Http.hx"
					{
						//line 620 "/usr/share/haxe/std/haxe/Http.hx"
						java.lang.String _g1 = hname.toLowerCase();
						//line 620 "/usr/share/haxe/std/haxe/Http.hx"
						{
							//line 620 "/usr/share/haxe/std/haxe/Http.hx"
							java.lang.String __temp_svar5 = (_g1);
							//line 620 "/usr/share/haxe/std/haxe/Http.hx"
							switch (__temp_svar5.hashCode())
							{
								case -1132779846:
								{
									//line 623 "/usr/share/haxe/std/haxe/Http.hx"
									if (__temp_svar5.equals("content-length")) 
									{
										//line 623 "/usr/share/haxe/std/haxe/Http.hx"
										size = haxe.root.Std.parseInt(hval);
									}
									
									//line 623 "/usr/share/haxe/std/haxe/Http.hx"
									break;
								}
								
								
								case 1274458357:
								{
									//line 625 "/usr/share/haxe/std/haxe/Http.hx"
									if (__temp_svar5.equals("transfer-encoding")) 
									{
										//line 625 "/usr/share/haxe/std/haxe/Http.hx"
										chunked = haxe.lang.Runtime.valEq(hval.toLowerCase(), "chunked");
									}
									
									//line 625 "/usr/share/haxe/std/haxe/Http.hx"
									break;
								}
								
								
							}
							
						}
						
					}
					
				}
				
			}
			
			//line 629 "/usr/share/haxe/std/haxe/Http.hx"
			this.onStatus.__hx_invoke1_o(0.0, status);
			//line 631 "/usr/share/haxe/std/haxe/Http.hx"
			haxe.root.EReg chunk_re = new haxe.root.EReg("^([0-9A-Fa-f]+)[ ]*\r\n", "m");
			//line 632 "/usr/share/haxe/std/haxe/Http.hx"
			this.chunk_size = null;
			//line 633 "/usr/share/haxe/std/haxe/Http.hx"
			this.chunk_buf = null;
			//line 635 "/usr/share/haxe/std/haxe/Http.hx"
			int bufsize = 1024;
			//line 636 "/usr/share/haxe/std/haxe/Http.hx"
			haxe.io.Bytes buf = haxe.io.Bytes.alloc(bufsize);
			//line 637 "/usr/share/haxe/std/haxe/Http.hx"
			if (haxe.lang.Runtime.eq(size, null)) 
			{
				//line 638 "/usr/share/haxe/std/haxe/Http.hx"
				if ( ! (this.noShutdown) ) 
				{
					//line 639 "/usr/share/haxe/std/haxe/Http.hx"
					haxe.lang.Runtime.callField(sock, "shutdown", new haxe.root.Array(new java.lang.Object[]{false, true}));
				}
				
				//line 641 "/usr/share/haxe/std/haxe/Http.hx"
				try 
				{
					//line 641 "/usr/share/haxe/std/haxe/Http.hx"
					while (true)
					{
						//line 642 "/usr/share/haxe/std/haxe/Http.hx"
						int len = ((haxe.io.Input) (haxe.lang.Runtime.getField(sock, "input", true)) ).readBytes(buf, 0, bufsize);
						//line 643 "/usr/share/haxe/std/haxe/Http.hx"
						if (chunked) 
						{
							//line 644 "/usr/share/haxe/std/haxe/Http.hx"
							if ( ! (this.readChunk(chunk_re, api, buf, len)) ) 
							{
								//line 645 "/usr/share/haxe/std/haxe/Http.hx"
								break;
							}
							
						}
						else
						{
							//line 647 "/usr/share/haxe/std/haxe/Http.hx"
							api.writeBytes(buf, 0, len);
						}
						
					}
					
				}
				catch (java.lang.Throwable __temp_catchallException1)
				{
					//line 641 "/usr/share/haxe/std/haxe/Http.hx"
					haxe.lang.Exceptions.setException(__temp_catchallException1);
					//line 649 "/usr/share/haxe/std/haxe/Http.hx"
					java.lang.Object __temp_catchall2 = __temp_catchallException1;
					//line 649 "/usr/share/haxe/std/haxe/Http.hx"
					if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
					{
						//line 649 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
					}
					
					//line 649 "/usr/share/haxe/std/haxe/Http.hx"
					if (( __temp_catchall2 instanceof haxe.io.Eof )) 
					{
						//line 649 "/usr/share/haxe/std/haxe/Http.hx"
						haxe.io.Eof e = ((haxe.io.Eof) (__temp_catchall2) );
						//line 649 "/usr/share/haxe/std/haxe/Http.hx"
						{
						}
						
					}
					else
					{
						//line 649 "/usr/share/haxe/std/haxe/Http.hx"
						throw haxe.lang.HaxeException.wrap(__temp_catchallException1);
					}
					
				}
				
				
			}
			else
			{
				//line 652 "/usr/share/haxe/std/haxe/Http.hx"
				api.prepare(((int) (haxe.lang.Runtime.toInt(size)) ));
				//line 654 "/usr/share/haxe/std/haxe/Http.hx"
				try 
				{
					//line 654 "/usr/share/haxe/std/haxe/Http.hx"
					while (( haxe.lang.Runtime.compare(size, 0) > 0 ))
					{
						//line 655 "/usr/share/haxe/std/haxe/Http.hx"
						int len1 = ((haxe.io.Input) (haxe.lang.Runtime.getField(sock, "input", true)) ).readBytes(buf, 0, ( (( haxe.lang.Runtime.compare(size, bufsize) > 0 )) ? (bufsize) : (((int) (haxe.lang.Runtime.toInt(size)) )) ));
						//line 656 "/usr/share/haxe/std/haxe/Http.hx"
						if (chunked) 
						{
							//line 657 "/usr/share/haxe/std/haxe/Http.hx"
							if ( ! (this.readChunk(chunk_re, api, buf, len1)) ) 
							{
								//line 658 "/usr/share/haxe/std/haxe/Http.hx"
								break;
							}
							
						}
						else
						{
							//line 660 "/usr/share/haxe/std/haxe/Http.hx"
							api.writeBytes(buf, 0, len1);
						}
						
						//line 661 "/usr/share/haxe/std/haxe/Http.hx"
						size = ( ((int) (haxe.lang.Runtime.toInt(size)) ) - ((int) (len1) ) );
					}
					
				}
				catch (java.lang.Throwable __temp_catchallException3)
				{
					//line 654 "/usr/share/haxe/std/haxe/Http.hx"
					haxe.lang.Exceptions.setException(__temp_catchallException3);
					//line 664 "/usr/share/haxe/std/haxe/Http.hx"
					java.lang.Object __temp_catchall4 = __temp_catchallException3;
					//line 664 "/usr/share/haxe/std/haxe/Http.hx"
					if (( __temp_catchall4 instanceof haxe.lang.HaxeException )) 
					{
						//line 664 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_catchall4 = ((haxe.lang.HaxeException) (__temp_catchallException3) ).obj;
					}
					
					//line 664 "/usr/share/haxe/std/haxe/Http.hx"
					if (( __temp_catchall4 instanceof haxe.io.Eof )) 
					{
						//line 664 "/usr/share/haxe/std/haxe/Http.hx"
						haxe.io.Eof e1 = ((haxe.io.Eof) (__temp_catchall4) );
						//line 664 "/usr/share/haxe/std/haxe/Http.hx"
						{
							//line 664 "/usr/share/haxe/std/haxe/Http.hx"
							throw haxe.lang.HaxeException.wrap("Transfer aborted");
						}
						
					}
					else
					{
						//line 664 "/usr/share/haxe/std/haxe/Http.hx"
						throw haxe.lang.HaxeException.wrap(__temp_catchallException3);
					}
					
				}
				
				
			}
			
			//line 667 "/usr/share/haxe/std/haxe/Http.hx"
			if (( chunked && (( ( ! (haxe.lang.Runtime.eq(this.chunk_size, null)) ) || ( this.chunk_buf != null ) )) )) 
			{
				//line 668 "/usr/share/haxe/std/haxe/Http.hx"
				throw haxe.lang.HaxeException.wrap("Invalid chunk");
			}
			
			//line 669 "/usr/share/haxe/std/haxe/Http.hx"
			if (( ( haxe.lang.Runtime.compare(status, 200) < 0 ) || ( haxe.lang.Runtime.compare(status, 400) >= 0 ) )) 
			{
				//line 670 "/usr/share/haxe/std/haxe/Http.hx"
				throw haxe.lang.HaxeException.wrap(( haxe.lang.Runtime.toString("Http Error #") + haxe.lang.Runtime.toString(status) ));
			}
			
			//line 671 "/usr/share/haxe/std/haxe/Http.hx"
			api.close();
		}
		catch (java.lang.Throwable typedException)
		{
			//line 534 "/usr/share/haxe/std/haxe/Http.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public boolean readChunk(haxe.root.EReg chunk_re, haxe.io.Output api, haxe.io.Bytes buf, int len)
	{
		//line 674 "/usr/share/haxe/std/haxe/Http.hx"
		try 
		{
			//line 675 "/usr/share/haxe/std/haxe/Http.hx"
			if (haxe.lang.Runtime.eq(this.chunk_size, null)) 
			{
				//line 676 "/usr/share/haxe/std/haxe/Http.hx"
				if (( this.chunk_buf != null )) 
				{
					//line 677 "/usr/share/haxe/std/haxe/Http.hx"
					haxe.io.BytesBuffer b = new haxe.io.BytesBuffer();
					//line 678 "/usr/share/haxe/std/haxe/Http.hx"
					{
						//line 678 "/usr/share/haxe/std/haxe/Http.hx"
						haxe.io.Bytes src = this.chunk_buf;
						//line 678 "/usr/share/haxe/std/haxe/Http.hx"
						b.b.write(((byte[]) (src.b) ), ((int) (0) ), ((int) (src.length) ));
					}
					
					//line 679 "/usr/share/haxe/std/haxe/Http.hx"
					{
						//line 679 "/usr/share/haxe/std/haxe/Http.hx"
						if (( ( len < 0 ) || ( len > buf.length ) )) 
						{
							//line 679 "/usr/share/haxe/std/haxe/Http.hx"
							throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
						}
						
						//line 679 "/usr/share/haxe/std/haxe/Http.hx"
						b.b.write(((byte[]) (buf.b) ), ((int) (0) ), ((int) (len) ));
					}
					
					//line 680 "/usr/share/haxe/std/haxe/Http.hx"
					buf = b.getBytes();
					//line 681 "/usr/share/haxe/std/haxe/Http.hx"
					len += this.chunk_buf.length;
					//line 682 "/usr/share/haxe/std/haxe/Http.hx"
					this.chunk_buf = null;
				}
				
				//line 687 "/usr/share/haxe/std/haxe/Http.hx"
				if (chunk_re.match(buf.toString())) 
				{
					//line 689 "/usr/share/haxe/std/haxe/Http.hx"
					java.lang.Object p = chunk_re.matchedPos();
					//line 690 "/usr/share/haxe/std/haxe/Http.hx"
					if (( haxe.lang.Runtime.compare(((int) (haxe.lang.Runtime.getField_f(p, "len", true)) ), len) <= 0 )) 
					{
						//line 691 "/usr/share/haxe/std/haxe/Http.hx"
						java.lang.String cstr = chunk_re.matched(1);
						//line 692 "/usr/share/haxe/std/haxe/Http.hx"
						this.chunk_size = haxe.root.Std.parseInt(( "0x" + cstr ));
						//line 693 "/usr/share/haxe/std/haxe/Http.hx"
						if (haxe.lang.Runtime.valEq(cstr, "0")) 
						{
							//line 694 "/usr/share/haxe/std/haxe/Http.hx"
							this.chunk_size = null;
							//line 695 "/usr/share/haxe/std/haxe/Http.hx"
							this.chunk_buf = null;
							//line 696 "/usr/share/haxe/std/haxe/Http.hx"
							return false;
						}
						
						//line 698 "/usr/share/haxe/std/haxe/Http.hx"
						len = ( ((int) (len) ) - ((int) (haxe.lang.Runtime.getField_f(p, "len", true)) ) );
						//line 699 "/usr/share/haxe/std/haxe/Http.hx"
						return this.readChunk(chunk_re, api, buf.sub(((int) (haxe.lang.Runtime.getField_f(p, "len", true)) ), len), len);
					}
					
				}
				
				//line 703 "/usr/share/haxe/std/haxe/Http.hx"
				if (( len > 10 )) 
				{
					//line 704 "/usr/share/haxe/std/haxe/Http.hx"
					this.onError.__hx_invoke1_o(0.0, "Invalid chunk");
					//line 705 "/usr/share/haxe/std/haxe/Http.hx"
					return false;
				}
				
				//line 707 "/usr/share/haxe/std/haxe/Http.hx"
				this.chunk_buf = buf.sub(0, len);
				//line 708 "/usr/share/haxe/std/haxe/Http.hx"
				return true;
			}
			
			//line 710 "/usr/share/haxe/std/haxe/Http.hx"
			if (( haxe.lang.Runtime.compare(this.chunk_size, len) > 0 )) 
			{
				//line 711 "/usr/share/haxe/std/haxe/Http.hx"
				{
					//line 711 "/usr/share/haxe/std/haxe/Http.hx"
					haxe.Http __temp_dynop1 = this;
					//line 711 "/usr/share/haxe/std/haxe/Http.hx"
					__temp_dynop1.chunk_size = ( ((int) (haxe.lang.Runtime.toInt(__temp_dynop1.chunk_size)) ) - ((int) (len) ) );
				}
				
				//line 712 "/usr/share/haxe/std/haxe/Http.hx"
				api.writeBytes(buf, 0, len);
				//line 713 "/usr/share/haxe/std/haxe/Http.hx"
				return true;
			}
			
			//line 715 "/usr/share/haxe/std/haxe/Http.hx"
			int end = ((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.plus(this.chunk_size, 2))) );
			//line 716 "/usr/share/haxe/std/haxe/Http.hx"
			if (( len >= end )) 
			{
				//line 717 "/usr/share/haxe/std/haxe/Http.hx"
				if (( haxe.lang.Runtime.compare(this.chunk_size, 0) > 0 )) 
				{
					//line 718 "/usr/share/haxe/std/haxe/Http.hx"
					api.writeBytes(buf, 0, ((int) (haxe.lang.Runtime.toInt(this.chunk_size)) ));
				}
				
				//line 719 "/usr/share/haxe/std/haxe/Http.hx"
				len -= end;
				//line 720 "/usr/share/haxe/std/haxe/Http.hx"
				this.chunk_size = null;
				//line 721 "/usr/share/haxe/std/haxe/Http.hx"
				if (( len == 0 )) 
				{
					//line 722 "/usr/share/haxe/std/haxe/Http.hx"
					return true;
				}
				
				//line 723 "/usr/share/haxe/std/haxe/Http.hx"
				return this.readChunk(chunk_re, api, buf.sub(end, len), len);
			}
			
			//line 725 "/usr/share/haxe/std/haxe/Http.hx"
			if (( haxe.lang.Runtime.compare(this.chunk_size, 0) > 0 )) 
			{
				//line 726 "/usr/share/haxe/std/haxe/Http.hx"
				api.writeBytes(buf, 0, ((int) (haxe.lang.Runtime.toInt(this.chunk_size)) ));
			}
			
			//line 727 "/usr/share/haxe/std/haxe/Http.hx"
			{
				//line 727 "/usr/share/haxe/std/haxe/Http.hx"
				haxe.Http __temp_dynop2 = this;
				//line 727 "/usr/share/haxe/std/haxe/Http.hx"
				__temp_dynop2.chunk_size = ( ((int) (haxe.lang.Runtime.toInt(__temp_dynop2.chunk_size)) ) - ((int) (len) ) );
			}
			
			//line 728 "/usr/share/haxe/std/haxe/Http.hx"
			return true;
		}
		catch (java.lang.Throwable typedException)
		{
			//line 674 "/usr/share/haxe/std/haxe/Http.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public haxe.lang.Function onData;
	
	public haxe.lang.Function onError;
	
	public haxe.lang.Function onStatus;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		{
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			boolean __temp_executeDef1 = true;
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			switch (field.hashCode())
			{
				case 3143036:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("file")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.file = ((java.lang.Object) (value) );
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -196911308:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("cnxTimeout")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.cnxTimeout = ((double) (value) );
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -1525550445:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("chunk_size")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.chunk_size = ((java.lang.Object) (value) );
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
			}
			
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			if (__temp_executeDef1) 
			{
				//line 50 "/usr/share/haxe/std/haxe/Http.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 50 "/usr/share/haxe/std/haxe/Http.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		{
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			boolean __temp_executeDef1 = true;
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			switch (field.hashCode())
			{
				case 1505928881:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("onStatus")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.onStatus = ((haxe.lang.Function) (value) );
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 116079:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("url")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.url = haxe.lang.Runtime.toString(value);
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -1349867671:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("onError")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.onError = ((haxe.lang.Function) (value) );
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 1438740363:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("responseData")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.responseData = haxe.lang.Runtime.toString(value);
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -1013421527:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("onData")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.onData = ((haxe.lang.Function) (value) );
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 989669175:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("noShutdown")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.noShutdown = haxe.lang.Runtime.toBool(value);
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -995427962:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("params")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.params = ((haxe.root.List<java.lang.Object>) (value) );
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -196911308:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("cnxTimeout")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.cnxTimeout = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 795307910:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("headers")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.headers = ((haxe.root.List<java.lang.Object>) (value) );
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 1387714565:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("responseHeaders")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.responseHeaders = ((haxe.ds.StringMap<java.lang.String>) (value) );
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 756526186:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("postData")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.postData = haxe.lang.Runtime.toString(value);
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -1525550445:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("chunk_size")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.chunk_size = ((java.lang.Object) (value) );
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 3143036:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("file")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.file = ((java.lang.Object) (value) );
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 2028982689:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("chunk_buf")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.chunk_buf = ((haxe.io.Bytes) (value) );
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return value;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
			}
			
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			if (__temp_executeDef1) 
			{
				//line 50 "/usr/share/haxe/std/haxe/Http.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 50 "/usr/share/haxe/std/haxe/Http.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		{
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			boolean __temp_executeDef1 = true;
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			switch (field.hashCode())
			{
				case 1505928881:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("onStatus")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.onStatus;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 116079:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("url")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.url;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -1349867671:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("onError")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.onError;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 1438740363:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("responseData")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.responseData;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -1013421527:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("onData")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.onData;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 989669175:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("noShutdown")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.noShutdown;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -1139644809:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("readChunk")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readChunk")) );
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -196911308:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("cnxTimeout")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.cnxTimeout;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -954305121:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("readHttpResponse")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readHttpResponse")) );
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 1387714565:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("responseHeaders")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.responseHeaders;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 2113105374:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("customRequest")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "customRequest")) );
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -1525550445:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("chunk_size")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.chunk_size;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 1095692943:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("request")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "request")) );
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 2028982689:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("chunk_buf")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.chunk_buf;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -1549120788:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("setPostData")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setPostData")) );
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 3143036:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("file")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.file;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -801118873:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("setParameter")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setParameter")) );
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 756526186:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("postData")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.postData;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 260127119:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("setHeader")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setHeader")) );
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 795307910:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("headers")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.headers;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -995427962:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("params")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.params;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
			}
			
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			if (__temp_executeDef1) 
			{
				//line 50 "/usr/share/haxe/std/haxe/Http.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 50 "/usr/share/haxe/std/haxe/Http.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		{
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			boolean __temp_executeDef1 = true;
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			switch (field.hashCode())
			{
				case 3143036:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("file")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.file)) );
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -196911308:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("cnxTimeout")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.cnxTimeout;
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -1525550445:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("chunk_size")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.chunk_size)) );
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
			}
			
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			if (__temp_executeDef1) 
			{
				//line 50 "/usr/share/haxe/std/haxe/Http.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 50 "/usr/share/haxe/std/haxe/Http.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		{
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			boolean __temp_executeDef1 = true;
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			switch (field.hashCode())
			{
				case -1139644809:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("readChunk")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.readChunk(((haxe.root.EReg) (dynargs.__get(0)) ), ((haxe.io.Output) (dynargs.__get(1)) ), ((haxe.io.Bytes) (dynargs.__get(2)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(3))) ));
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 260127119:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("setHeader")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.setHeader(haxe.lang.Runtime.toString(dynargs.__get(0)), haxe.lang.Runtime.toString(dynargs.__get(1)));
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -954305121:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("readHttpResponse")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.readHttpResponse(((haxe.io.Output) (dynargs.__get(0)) ), dynargs.__get(1));
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -801118873:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("setParameter")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.setParameter(haxe.lang.Runtime.toString(dynargs.__get(0)), haxe.lang.Runtime.toString(dynargs.__get(1)));
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 2113105374:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("customRequest")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.customRequest(haxe.lang.Runtime.toBool(dynargs.__get(0)), ((haxe.io.Output) (dynargs.__get(1)) ), dynargs.__get(2), haxe.lang.Runtime.toString(dynargs.__get(3)));
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case -1549120788:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("setPostData")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						return this.setPostData(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
				case 1095692943:
				{
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					if (field.equals("request")) 
					{
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						__temp_executeDef1 = false;
						//line 50 "/usr/share/haxe/std/haxe/Http.hx"
						this.request(dynargs.__get(0));
					}
					
					//line 50 "/usr/share/haxe/std/haxe/Http.hx"
					break;
				}
				
				
			}
			
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			if (__temp_executeDef1) 
			{
				//line 50 "/usr/share/haxe/std/haxe/Http.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		baseArr.push("onStatus");
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		baseArr.push("onError");
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		baseArr.push("onData");
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		baseArr.push("params");
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		baseArr.push("headers");
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		baseArr.push("postData");
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		baseArr.push("file");
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		baseArr.push("chunk_buf");
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		baseArr.push("chunk_size");
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		baseArr.push("responseHeaders");
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		baseArr.push("cnxTimeout");
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		baseArr.push("noShutdown");
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		baseArr.push("responseData");
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		baseArr.push("url");
		//line 50 "/usr/share/haxe/std/haxe/Http.hx"
		{
			//line 50 "/usr/share/haxe/std/haxe/Http.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


