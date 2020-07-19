import { TestBed } from '@angular/core/testing';

import { ServiceCinemasService } from './service-cinemas.service';

describe('ServiceCinemasService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceCinemasService = TestBed.get(ServiceCinemasService);
    expect(service).toBeTruthy();
  });
});
