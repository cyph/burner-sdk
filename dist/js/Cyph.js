(function(e,t){"use strict";var n=function(){return S.__string_rec(this,"")};function r(e,t){function n(){}n.prototype=e;var r=new n;for(var i in t)r[i]=t[i];if(t.toString!==Object.prototype.toString)r.toString=t.toString;return r}var i=function(){};i.__name__=true;i.cca=function(e,t){var n=e.charCodeAt(t);if(n!=n){return undefined}return n};var a=e["Cyph"]=function(){};a.__name__=true;a.generateGuid=function(e){var t=e*4;var n=f.getSecureRandomBytes(t);var r=g.fromBytes(n);var i=0;var s=e;while(i<s){var o=i++;var u=a.addressSpace[Math.floor(h.toFloat(r[o])/4294967296*a.addressSpace.length)|0];n.b[o]=u&255}var l=new y(n,0,e).readString(e);n.fill(0,t,0);return l};a.request=function(e,t,n,r,i,a){var s=function(){try{return typeof s!=="undefined"?s:require("node-fetch")}catch(e){}}();if(s){var o={headers:n.reduce(function(e,t){e[t.k]=t.v;return e},{}),method:t?"POST":"GET"};if(t&&r.length>0){o.headers["Content-Type"]="application/x-www-form-urlencoded";o.body=r.map(function(e){return e.k+"="+e.v}).join("&")}s(e,o).then(function(e){var t=e.text().then(function(e){return e.trim()});if(e.ok){return t}else{return t.then(function(e){throw new Error(e)})}}).then(i).catch(a);return}var u=new v(e);u.onData=i;u.onError=a;var l=0;while(l<n.length){var _=n[l];++l;u.setHeader(_.k,_.v)}var f=0;while(f<r.length){var c=r[f];++f;u.setParameter(c.k,c.v)}u.request(t)};a.generateLink=function(e){if(e==null){e=[]}var t=a.generateGuid(7);return{id:t,link:"https://"+(e.indexOf(a.options.video)>-1?a.services.video:e.indexOf(a.options.voice)>-1?a.services.voice:a.services.chat)+"/#"+(e.indexOf(a.options.modestBranding)>-1?"&":"")+(e.indexOf(a.options.disableP2P)>-1?"$":"")+(e.indexOf(a.options.nativeCrypto)>-1?"%":"")+t+a.generateGuid(19)}};a.initiateSession=function(e,t,n,r){var i=a.generateLink(t);a.request("https://simple-buu700-master-dot-cyphme.appspot.com/preauth/"+i.id,true,[{k:"Authorization",v:e}],[],function(e){n(i.link)},r)};var s=function(e,t){this.r=new RegExp(e,t.split("u").join(""))};s.__name__=true;s.prototype={match:function(e){if(this.r.global){this.r.lastIndex=0}this.r.m=this.r.exec(e);this.r.s=e;return this.r.m!=null},__class__:s};var o=function(){};o.__name__=true;o.exists=function(e,t){var n=e.iterator();while(n.hasNext()){var r=n.next();if(t(r)){return true}}return false};o.filter=function(e,t){var n=new u;var r=e.iterator();while(r.hasNext()){var i=r.next();if(t(i)){n.add(i)}}return n};var u=function(){this.length=0};u.__name__=true;u.prototype={add:function(e){var t=new l(e,null);if(this.h==null){this.h=t}else{this.q.next=t}this.q=t;this.length++},push:function(e){var t=new l(e,this.h);this.h=t;if(this.q==null){this.q=t}this.length++},iterator:function(){return new _(this.h)},__class__:u};var l=function(e,t){this.item=e;this.next=t};l.__name__=true;l.prototype={__class__:l};var _=function(e){this.head=e};_.__name__=true;_.prototype={hasNext:function(){return this.head!=null},next:function(){var e=this.head.item;this.head=this.head.next;return e},__class__:_};Math.__name__=true;var f=function(){};f.__name__=true;f.getSecureRandomBytes=function(e){var t="";try{var n=typeof crypto==="undefined"?require("crypto"):crypto;var r=n.randomBytes?n.randomBytes(e):n.getRandomValues(new j(e));var i=new p(new A(e));var a=0;var s=e;while(a<s){var o=a++;i.b[o]=r[o]&255}return i}catch(e){if(e instanceof b)e=e.val;t=""+c.string(e)}throw new b("Can't find a secure source of random bytes. Reason: "+t)};var c=function(){};c.__name__=true;c.string=function(e){return S.__string_rec(e,"")};var h={};h.__name__=true;h.toFloat=function(e){var t=e;if(t<0){return 4294967296+t}else{return t+0}};var v=function(e){this.url=e;this.headers=new u;this.params=new u;this.async=true;this.withCredentials=false};v.__name__=true;v.prototype={setHeader:function(e,t){this.headers=o.filter(this.headers,function(t){return t.header!=e});this.headers.push({header:e,value:t});return this},setParameter:function(e,t){this.params=o.filter(this.params,function(t){return t.param!=e});this.params.push({param:e,value:t});return this},request:function(e){var t=this;t.responseData=null;var n=this.req=O.createXMLHttpRequest();var r=function(e){if(n.readyState!=4){return}var r;try{r=n.status}catch(e){r=null}if(r!=null&&"undefined"!==typeof window){var i=window.location.protocol.toLowerCase();var a=new s("^(?:about|app|app-storage|.+-extension|file|res|widget):$","");var o=a.match(i);if(o){if(n.responseText!=null){r=200}else{r=404}}}if(r==undefined){r=null}if(r!=null){t.onStatus(r)}if(r!=null&&r>=200&&r<400){t.req=null;t.onData(t.responseData=n.responseText)}else if(r==null){t.req=null;t.onError("Failed to connect or resolve host")}else{switch(r){case 12007:t.req=null;t.onError("Unknown host");break;case 12029:t.req=null;t.onError("Failed to connect to host");break;default:t.req=null;t.responseData=n.responseText;t.onError("Http Error #"+n.status)}}};if(this.async){n.onreadystatechange=r}var i=this.postData;if(i!=null){e=true}else{var a=this.params.h;while(a!=null){var u=a.item;a=a.next;var l=u;if(i==null){i=""}else{i+="&"}var _=l.param;var f=encodeURIComponent(_)+"=";var c=l.value;i+=f+encodeURIComponent(c)}}try{if(e){n.open("POST",this.url,this.async)}else if(i!=null){var h=this.url.split("?").length<=1;n.open("GET",this.url+(h?"?":"&")+i,this.async);i=null}else{n.open("GET",this.url,this.async)}}catch(e){if(e instanceof b)e=e.val;t.req=null;this.onError(e.toString());return}n.withCredentials=this.withCredentials;if(!o.exists(this.headers,function(e){return e.header=="Content-Type"})&&e&&this.postData==null){n.setRequestHeader("Content-Type","application/x-www-form-urlencoded")}var v=this.headers.h;while(v!=null){var p=v.item;v=v.next;var d=p;n.setRequestHeader(d.header,d.value)}n.send(i);if(!this.async){r(null)}},onData:function(e){},onError:function(e){},onStatus:function(e){},__class__:v};var p=function(e){this.length=e.byteLength;this.b=new j(e);this.b.bufferValue=e;e.hxBytes=this;e.bytes=this.b};p.__name__=true;p.prototype={fill:function(e,t,n){var r=0;var i=t;while(r<i){var a=r++;this.b[e++]=n&255}},getString:function(e,t){if(e<0||t<0||e+t>this.length){throw new b(m.OutsideBounds)}var n="";var r=this.b;var i=String.fromCharCode;var a=e;var s=e+t;while(a<s){var o=r[a++];if(o<128){if(o==0){break}n+=i(o)}else if(o<224){n+=i((o&63)<<6|r[a++]&127)}else if(o<240){var u=r[a++];n+=i((o&31)<<12|(u&127)<<6|r[a++]&127)}else{var l=r[a++];var _=r[a++];var f=(o&15)<<18|(l&127)<<12|(_&127)<<6|r[a++]&127;n+=i((f>>10)+55232);n+=i(f&1023|56320)}}return n},toString:function(){return this.getString(0,this.length)},__class__:p};var d=function(){};d.__name__=true;d.prototype={readByte:function(){throw new b("Not implemented")},readBytes:function(e,t,n){var r=n;var i=e.b;if(t<0||n<0||t+n>e.length){throw new b(m.OutsideBounds)}try{while(r>0){i[t]=this.readByte();++t;--r}}catch(e){if(e instanceof b)e=e.val;if(S.__instanceof(e,w)){}else throw e}return n-r},readFullBytes:function(e,t,n){while(n>0){var r=this.readBytes(e,t,n);if(r==0){throw new b(m.Blocked)}t+=r;n-=r}},readString:function(e){var t=new p(new A(e));this.readFullBytes(t,0,e);return t.toString()},__class__:d};var y=function(e,t,n){if(t==null){t=0}if(n==null){n=e.length-t}if(t<0||n<0||t+n>e.length){throw new b(m.OutsideBounds)}this.b=e.b;this.pos=t;this.len=n;this.totlen=n};y.__name__=true;y.__super__=d;y.prototype=r(d.prototype,{readByte:function(){if(this.len==0){throw new b(new w)}this.len--;return this.b[this.pos++]},readBytes:function(e,t,n){if(t<0||n<0||t+n>e.length){throw new b(m.OutsideBounds)}if(this.len==0&&n>0){throw new b(new w)}if(this.len<n){n=this.len}var r=this.b;var i=e.b;var a=0;var s=n;while(a<s){var o=a++;i[t+o]=r[this.pos+o]}this.pos+=n;this.len-=n;return n},__class__:y});var w=function(){};w.__name__=true;w.prototype={toString:function(){return"Eof"},__class__:w};var m={__ename__:true,__constructs__:["Blocked","Overflow","OutsideBounds","Custom"]};m.Blocked=["Blocked",0];m.Blocked.toString=n;m.Blocked.__enum__=m;m.Overflow=["Overflow",1];m.Overflow.toString=n;m.Overflow.__enum__=m;m.OutsideBounds=["OutsideBounds",2];m.OutsideBounds.toString=n;m.OutsideBounds.__enum__=m;m.Custom=function(e){var t=["Custom",3,e];t.__enum__=m;t.toString=n;return t};var g={};g.__name__=true;g.fromBytes=function(e,t,n){if(t==null){t=0}if(n==null){n=e.length-t>>2}return new Uint32Array(e.b.bufferValue,t,n)};var b=function(e){Error.call(this);this.val=e;this.message=String(e);if(Error.captureStackTrace){Error.captureStackTrace(this,b)}};b.__name__=true;b.wrap=function(e){if(e instanceof Error){return e}else{return new b(e)}};b.__super__=Error;b.prototype=r(Error.prototype,{__class__:b});var S=function(){};S.__name__=true;S.getClass=function(e){if(e instanceof Array&&e.__enum__==null){return Array}else{var t=e.__class__;if(t!=null){return t}var n=S.__nativeClassName(e);if(n!=null){return S.__resolveNativeClass(n)}return null}};S.__string_rec=function(e,t){if(e==null){return"null"}if(t.length>=5){return"<...>"}var n=typeof e;if(n=="function"&&(e.__name__||e.__ename__)){n="object"}switch(n){case"function":return"<function>";case"object":if(e instanceof Array){if(e.__enum__){if(e.length==2){return e[0]}var r=e[0]+"(";t+="\t";var i=2;var a=e.length;while(i<a){var s=i++;if(s!=2){r+=","+S.__string_rec(e[s],t)}else{r+=S.__string_rec(e[s],t)}}return r+")"}var o=e.length;var u;var l="[";t+="\t";var _=0;var f=o;while(_<f){var c=_++;l+=(c>0?",":"")+S.__string_rec(e[c],t)}l+="]";return l}var h;try{h=e.toString}catch(e){return"???"}if(h!=null&&h!=Object.toString&&typeof h=="function"){var v=e.toString();if(v!="[object Object]"){return v}}var p=null;var d="{\n";t+="\t";var y=e.hasOwnProperty!=null;for(var p in e){if(y&&!e.hasOwnProperty(p)){continue}if(p=="prototype"||p=="__class__"||p=="__super__"||p=="__interfaces__"||p=="__properties__"){continue}if(d.length!=2){d+=", \n"}d+=t+p+" : "+S.__string_rec(e[p],t)}t=t.substring(1);d+="\n"+t+"}";return d;case"string":return e;default:return String(e)}};S.__interfLoop=function(e,t){if(e==null){return false}if(e==t){return true}var n=e.__interfaces__;if(n!=null){var r=0;var i=n.length;while(r<i){var a=r++;var s=n[a];if(s==t||S.__interfLoop(s,t)){return true}}}return S.__interfLoop(e.__super__,t)};S.__instanceof=function(e,t){if(t==null){return false}switch(t){case Array:if(e instanceof Array){return e.__enum__==null}else{return false}break;case k:return typeof e=="boolean";case L:return true;case E:return typeof e=="number";case C:if(typeof e=="number"){return(e|0)===e}else{return false}break;case String:return typeof e=="string";default:if(e!=null){if(typeof t=="function"){if(e instanceof t){return true}if(S.__interfLoop(S.getClass(e),t)){return true}}else if(typeof t=="object"&&S.__isNativeObj(t)){if(e instanceof t){return true}}}else{return false}if(t==q?e.__name__!=null:false){return true}if(t==T?e.__ename__!=null:false){return true}return e.__enum__==t}};S.__nativeClassName=function(e){var t=S.__toStr.call(e).slice(8,-1);if(t=="Object"||t=="Function"||t=="Math"||t=="JSON"){return null}return t};S.__isNativeObj=function(e){return S.__nativeClassName(e)!=null};S.__resolveNativeClass=function(e){return t[e]};var O=function(){};O.__name__=true;O.createXMLHttpRequest=function(){if(typeof XMLHttpRequest!="undefined"){return new XMLHttpRequest}if(typeof ActiveXObject!="undefined"){return new ActiveXObject("Microsoft.XMLHTTP")}throw new b("Unable to create XMLHttpRequest object.")};var B=function(e){if(e instanceof Array&&e.__enum__==null){this.a=e;this.byteLength=e.length}else{var t=e;this.a=[];var n=0;var r=t;while(n<r){var i=n++;this.a[i]=0}this.byteLength=t}};B.__name__=true;B.sliceImpl=function(e,t){var n=new j(this,e,t==null?null:t-e);var r=new A(n.byteLength);var i=new j(r);i.set(n);return r};B.prototype={slice:function(e,t){return new B(this.a.slice(e,t))},__class__:B};var x=function(){};x.__name__=true;x._new=function(e,t,n){var r;if(typeof e=="number"){r=[];var i=0;var a=e;while(i<a){var s=i++;r[s]=0}r.byteLength=r.length;r.byteOffset=0;r.buffer=new B(r)}else if(S.__instanceof(e,B)){var o=e;if(t==null){t=0}if(n==null){n=o.byteLength-t}if(t==0){r=o.a}else{r=o.a.slice(t,t+n)}r.byteLength=r.length;r.byteOffset=t;r.buffer=o}else if(e instanceof Array&&e.__enum__==null){r=e.slice();r.byteLength=r.length;r.byteOffset=0;r.buffer=new B(r)}else{throw new b("TODO "+c.string(e))}r.subarray=x._subarray;r.set=x._set;return r};x._set=function(e,t){if(S.__instanceof(e.buffer,B)){var n=e;if(e.byteLength+t>this.byteLength){throw new b("set() outside of range")}var r=0;var i=e.byteLength;while(r<i){var a=r++;this[a+t]=n[a]}}else if(e instanceof Array&&e.__enum__==null){var s=e;if(s.length+t>this.byteLength){throw new b("set() outside of range")}var o=0;var u=s.length;while(o<u){var l=o++;this[l+t]=s[l]}}else{throw new b("TODO")}};x._subarray=function(e,t){var n=x._new(this.slice(e,t));n.byteOffset=e;return n};String.prototype.__class__=String;String.__name__=true;Array.__name__=true;var C={__name__:["Int"]};var L={__name__:["Dynamic"]};var E=Number;E.__name__=["Float"];var k=Boolean;k.__ename__=["Bool"];var q={__name__:["Class"]};var T={};var A=t.ArrayBuffer||B;if(A.prototype.slice==null){A.prototype.slice=B.sliceImpl}var j=t.Uint8Array||x._new;a.addressSpace=["0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"].map(function(e){return i.cca(e,0)});a.services={chat:"simple-buu700-master-dot-cyph-im-dot-cyphme.appspot.com/#",voice:"simple-buu700-master-dot-cyph-im-dot-cyphme.appspot.com/#audio/",video:"simple-buu700-master-dot-cyph-im-dot-cyphme.appspot.com/#video/"};a.options={voice:1,video:2,modestBranding:3,disableP2P:4,nativeCrypto:5,telehealth:6};S.__toStr={}.toString;x.BYTES_PER_ELEMENT=1})(typeof exports!="undefined"?exports:typeof window!="undefined"?window:typeof self!="undefined"?self:this,typeof window!="undefined"?window:typeof global!="undefined"?global:typeof self!="undefined"?self:this);