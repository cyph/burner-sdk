#ifndef INCLUDED_Cyph
#define INCLUDED_Cyph

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(Cyph)


class HXCPP_CLASS_ATTRIBUTES  Cyph_obj : public hx::Object{
	public:
		typedef hx::Object super;
		typedef Cyph_obj OBJ_;
		Cyph_obj();
		Void __construct();

	public:
		inline void *operator new( size_t inSize, bool inContainer=false,const char *inName="Cyph")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< Cyph_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Cyph_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static bool __SetStatic(const ::String &inString, Dynamic &ioValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Cyph","\x4e","\x7e","\xa5","\x2c"); }

		static void __boot();
		static Array< ::Dynamic > addressSpace;
		static Dynamic services;
		static Dynamic options;
		static ::String generateGuid( int length);
		static Dynamic generateGuid_dyn();

		static Void request( ::String url,bool post,cpp::ArrayBase headers,cpp::ArrayBase parameters,Dynamic onData,Dynamic onError);
		static Dynamic request_dyn();

		static Dynamic generateLink( Array< int > options,Dynamic services);
		static Dynamic generateLink_dyn();

		static Void initiateSession( ::String apiKey,Array< int > options,Dynamic services,Dynamic onData,Dynamic onError);
		static Dynamic initiateSession_dyn();

};


#endif /* INCLUDED_Cyph */ 
